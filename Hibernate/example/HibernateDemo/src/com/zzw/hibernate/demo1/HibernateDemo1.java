package com.zzw.hibernate.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

/**
 * Hibernate 入门
 *
 * */
public class HibernateDemo1 {

    /**
     * 保存客户案例
     * */
    @Test
    public void demo1(){
        //1.加载Hibernate的核心配置文件
        Configuration configuration = new Configuration().configure();

        //2.创建SessionFactory对象: 类似于JDBC连接池
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        //3.通过SessionFactory获取Session对象: 类似于JDBCConnection
        Session session = sessionFactory.openSession();

        //4.手动开启事物
        Transaction transaction = session.beginTransaction();

        //5.编写代码
        Customer customer = new Customer();
        customer.setCust_name("司马懿");
        session.save(customer);

        //6.事物提交
        transaction.commit();

        //7.资源释放
        session.close();
    }
}
