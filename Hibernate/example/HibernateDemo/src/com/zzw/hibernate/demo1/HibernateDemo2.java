package com.zzw.hibernate.demo1;

import com.zzw.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

/**
 * Hibernate 入门
 *
 * */
public class HibernateDemo2 {

    /**
     * 保存客户案例
     * */
    @Test
    public void demo1(){

        //1.通过SessionFactory获取Session对象: 类似于JDBCConnection
        Session session = HibernateUtils.openSession();

        //2.手动开启事物
        Transaction transaction = session.beginTransaction();

        //3.编写代码
        Customer customer = new Customer();
        customer.setCust_name("司马光");
        session.save(customer);

        //4.事物提交
        transaction.commit();

        //5.资源释放
        session.close();
        //关闭sessionFactory
        //HibernateUtils.sf.close();
    }
}
