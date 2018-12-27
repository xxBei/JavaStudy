package com.zzw.hibernate.demo1;

import com.zzw.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

/**
 * Hibernate 入门
 *
 * */
public class HibernateDemo3 {

    /**
     * 查询客户信息
     *
     * get 和 load 都是查询数据
     *
     * */
    @Test
    public void demo1() {
        /**
         * get 和 load 的区别
         *
         * get:
         *      1.采用的是立即加载，执行到这行代码时候，就会马上发送SQL语句去查询
         *      2.查询后返回真实对象本身
         *      3.查询一个找不到的对象的时候会返回null
         *
         * load:
         *      1.采用的是延迟加载（懒加载），执行到这行代码时，不会发送SQL语句，当真正使用这个对象的时候，才会发送SQL语句
         *      2.查询后返回一个代理对象。
         *      3.查询一个找不到的对象的时候，会报ObjectNotFoundException
         *
         * */

        Session session = HibernateUtils.openSession();
        //开启事物
        Transaction transaction = session.beginTransaction();

        /*get方法*/
        //1L 表示查找id为1的数据
        Customer customer = session.get(Customer.class,1L);
        System.out.println(customer);

        /*load方法*/
        /*Customer customer = session.load(Customer.class,2l);
        System.out.println(customer);*/

        //提交事物
        transaction.commit();
        session.close();
    }
}
