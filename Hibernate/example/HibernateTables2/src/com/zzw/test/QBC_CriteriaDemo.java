package com.zzw.test;

import com.zzw.Utils.HibernateUtils;
import com.zzw.domain.Customer;
import com.zzw.domain.LinkMan;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.*;
import org.junit.jupiter.api.Test;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * QBC旧方法Criteria
 * */
public class QBC_CriteriaDemo {

    @Test
    /**
     * 简单查询
     * */
    public void test01(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(Customer.class);
        List<Customer> list = criteria.list();

        for(Customer customer : list){
            System.out.println(customer);
        }

        transaction.commit();
    }

    @Test
    /**
     * 排序查询
     * */
    public void test02(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(Customer.class);
        //criteria.addOrder(Order.asc("cust_id"));//正序
        criteria.addOrder(Order.desc("cust_id"));//倒序
        List<Customer> list = criteria.list();

        for(Customer customer : list){
            System.out.println(customer);
        }

        transaction.commit();
    }

    @Test
    /**
     * 分页查询
     * */
    public void test03(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(LinkMan.class);
        criteria.setFirstResult(0);
        criteria.setMaxResults(15);
        List<LinkMan> list = criteria.list();

        for(LinkMan linkMan : list){
            System.out.println(linkMan);
        }
        transaction.commit();
    }

    @Test
    /**
     * 条件查询
     * */
    public void test04(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(Customer.class);
        /**
         * =  : eq
         * >  : gt
         * >= : ge
         * <  : lt
         * <= : le
         * <> : ne  不等于
         * like , in , and , or
         * */
        //添加1个条件,eq表示等于: cust_source="百度推广"
        criteria.add(Restrictions.eq("cust_source","百度推广"));
        //添加2个条件
        criteria.add(Restrictions.like("cust_name","李%"));
        List<Customer> list = criteria.list();

        for(Customer customer : list){
            System.out.println(customer);
        }
        transaction.commit();
    }

    @Test
    /**
     * 统计查询
     * */
    public void test05(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = session.createCriteria(Customer.class);
        /**
         * add  : 普通的条件. where后面条件
         * addOrder : 排序
         * setprojection : 聚合函数 和  group by  having
         * */
        criteria.setProjection(Projections.rowCount());
        Object obj = criteria.uniqueResult();
        System.out.println(obj);

        transaction.commit();
    }
}
