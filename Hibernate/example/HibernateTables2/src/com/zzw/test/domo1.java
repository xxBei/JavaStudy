package com.zzw.test;

import com.zzw.Utils.HibernateUtils;
import com.zzw.domain.Customer;
import com.zzw.domain.LinkMan;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


/**
 * HQL:查询的测试类
 * */
public class domo1 {

    @Test
    /**
     * 向数据库插入些数据
     * */
    public void test01(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = new Customer();
        customer.setCust_name("周星辰");

        for(var i=1;i<=10;i++){
            LinkMan linkMan = new LinkMan();
            linkMan.setLkm_name("朱茵茵"+i);

            customer.getLinkMans().add(linkMan);

            session.save(linkMan);
        }

        session.save(customer);
        transaction.commit();
    }

    @Test
    /**
     * HQL简单查询
     * */
    public void test02(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from Customer ");
        List<Customer> list = query.list();

        for(Customer customer : list){
            System.out.println(customer);
        }

        transaction.commit();
    }

    @Test
    /**
     * HQL别名查询
     * */
    public void test03(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        //别名查询1
        /*Query query = session.createQuery("select c from Customer c");
        List<Customer> list = query.list();*/

        //别名查询2
        Query query = session.createQuery("from Customer c");
        List<Customer> list = query.list();

        for(Customer customer : list){
            System.out.println(customer);
        }

        transaction.commit();
    }

    @Test
    /**
     * HQL排序查询
     * */
    public void test04(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        //默认升序排序
        //List<Customer> list = session.createQuery("from Customer order by cust_id").list();
        //降序排序
        List<Customer> list = session.createQuery("from Customer order by cust_id desc").list();

        for(Customer customer : list){
            System.out.println(customer);
        }

        transaction.commit();
    }

    @Test
    /**
     * HQL条件查询
     * */
    public void test05(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        /**
         * 按位置绑定:根据参数的位置进行绑定
         */
        //一个条件查询
        /*Query query = session.createQuery("from Customer where cust_name = ?0");
        query.setParameter(0,"李冰");*/

        //多个条件查询
        /*Query query = session.createQuery("from Customer where cust_source = ?0 and cust_name " +
                "like ?1");
        query.setParameter(0,"百度推广");
        query.setParameter(1,"李%");*/

        /**
         * 按名称绑定
         * */
        Query query = session.createQuery("from Customer where cust_name = :aaa and cust_source " +
                "like :bbb");
        query.setParameter("aaa","李冰");
        query.setParameter("bbb","百%");

        List<Customer> list = query.list();
        for(Customer customer : list){
            System.out.println(customer);
        }

        transaction.commit();
    }

    @Test
    /**
     * 投影查询:查询对象的某个或多个属性
     * */
    public void test06(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        //单个属性
        /*Query query = session.createQuery("select c.cust_name from Customer c");
        List<Customer> list = query.list();
        for(Object obj : list){
            System.out.println(obj);
        }*/

        //多个属性
        /*Query query = session.createQuery("select c.cust_name,c.cust_source from Customer c");
        List<Object[]> list = query.list();//将查询结果放入数组中
        for(Object[] objects : list){
            System.out.println(Arrays.toString(objects));
        }*/

        //查询多个属性,但是将查询的结构放在对象中去
        Query query = session.createQuery("select new Customer (cust_name,cust_source) from " +
                "Customer ");
        List<Customer> list = query.list();
        for(Customer customer:list){
            System.out.println(customer);
        }

        transaction.commit();
    }

    @Test
    /**
     * 分页查询:
     * */
    public void test07(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from LinkMan ");
        query.setFirstResult(0);//设置起始位置
        query.setMaxResults(15);//设置查询几条
        List<LinkMan> list = query.list();
        for(LinkMan linkMan:list){
            System.out.println(linkMan);
        }

        transaction.commit();
    }
}
