package com.zzw.hibernate.demo1;

import com.zzw.Utils.HibernateUtils;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


public class HibernateDemo4 {

    /*Hibernate 增加数据*/
    @Test
    public void test1(){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();

        /*增加数据*/
        Customer customer = new Customer();
        customer.setCust_name("秦牧");
        session.save(customer);

        transaction.commit();
        session.close();
    }

    /*Hibernate 查找根据条件查找指定数据*/
    @Test
    public void test2(){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();

        /*get:根据要求查找指定数据*/
        /*Customer customer = session.get(Customer.class,1l);
        System.out.println(customer);*/

        /*load*/
        Customer customer = session.load(Customer.class,2l);
        System.out.println(customer);
        transaction.commit();
        session.close();
    }

    /*Hibernate  修改表中数据*/
    @Test
    public void test3(){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();

        //方法一:直接创建对象,进行修改,如果不全部设置会全部修改
        /*Customer customer = new Customer();
        customer.setCust_id(1L);
        customer.setCust_name("曹操");
        customer.setCust_level("丞相");
        session.update(customer);*/

        //方法二.先查询,在修改(推荐) 之前存在的数据不会清除
        Customer customer = session.get(Customer.class,2l);
        customer.setCust_name("刘邦");
        customer.setCust_level("汉高祖");
        session.update(customer);

        transaction.commit();
        session.close();
    }

    @Test
    public void test4(){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();

        /*直接创建对象,删除*/
        /*Customer customer = new Customer();
        customer.setCust_id(4l);
        session.delete(customer);*/

        /*先查询,在删除(推荐) -- 可以级联删除*/
        Customer customer = session.get(Customer.class,3l);
        session.delete(customer);

        transaction.commit();
        session.close();
    }

    /*保存或修改数据*/
    @Test
    public void test5(){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();

        /*保存或者是插入数据*/
        /*Customer customer = new Customer();
        customer.setCust_name("刘彻");
        customer.setCust_level("汉武帝");
        session.saveOrUpdate(customer);*/

        /*修改数据*/
        Customer customer = new Customer();
        customer.setCust_id(5l);
        customer.setCust_name("霍去病");
        customer.setCust_level("大将军");
        session.saveOrUpdate(customer);

        transaction.commit();
        session.close();
    }

    @Test
    public void test6(){
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();

        //接收HQL: Hibernate query language  面向对象的查询语言
        /*Query query = session.createQuery("from Customer");
        List<Customer> list = query.list();
        for (Customer customer : list){
            System.out.println(customer);
        }*/

        //接收SQL:
        NativeQuery nativeQuery = session.createSQLQuery("select * from cst_customer");
        List<Object[]> list = nativeQuery.list();
        for (Object[] objects : list){
            System.out.println(Arrays.toString(objects));
        }

        transaction.commit();
        session.close();
    }

}
