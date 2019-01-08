package com.zzw.test;

import com.zzw.Utils.HibernateUtils;
import com.zzw.domain.Customer;
import com.zzw.domain.LinkMan;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.junit.jupiter.api.Test;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
//import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * QBC新方法CriteriaBuilder
 * */
public class QBCDemo {

    @Test
    /**
     *简单查询
     * */
    public void test01(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        //获取CriteriaBuilder
        CriteriaBuilder builder = session.getCriteriaBuilder();
        //通过builder获取CriteriaQuery
        CriteriaQuery<Customer> criteriaQuery = builder.createQuery(Customer.class);
        //Root 对应着Customer这个实体,from表示查询表
        Root<Customer> root = criteriaQuery.from(Customer.class);
        //查询实体(表)中全部字段
        criteriaQuery.select(root);
        //创建一个Query用于执行criteria查询,下面两个方法都可以使用
        //Query<Customer> query = session.createQuery(criteriaQuery);
        Query query = session.createQuery(criteriaQuery);

        List<Customer> list = query.list();
        for(Customer customer : list){
            System.out.println(customer);
        }

        transaction.commit();
    }

    @Test
    /**
     * 简单方法之缩减式
     * */
    public void test02(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        CriteriaQuery<Customer> criteriaQuery = session.getCriteriaBuilder().createQuery(Customer.class);
        Root<Customer> root = criteriaQuery.from(Customer.class);
        criteriaQuery.select(root);
        List<Customer> list = session.createQuery(criteriaQuery).list();
        for(Customer customer : list){
            System.out.println(customer);
        }

        transaction.commit();
    }

    @Test
    /**
     * 排序查询order by
     * */
    public void test03(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Customer> criteriaQuery = builder.createQuery(Customer.class);
        Root<Customer> root = criteriaQuery.from(Customer.class);
        //根据cust_id排序
        //criteriaQuery.orderBy(builder.asc(root.get("cust_id")));//正序
        criteriaQuery.orderBy(builder.desc(root.get("cust_id")));//倒序

        Query query = session.createQuery(criteriaQuery);
        List<Customer> list = query.list();

        for(Customer customer : list){
            System.out.println(customer);
        }

        transaction.commit();
    }


    @Test
    /**
     * 分页查询
     * */
    public void test04(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<LinkMan> criteriaQuery = builder.createQuery(LinkMan.class);
        Root<LinkMan> root = criteriaQuery.from(LinkMan.class);
        Query query = session.createQuery(criteriaQuery);
        query.setFirstResult(0);
        query.setMaxResults(15);
        List<LinkMan> list = query.list();
        for(LinkMan linkMan : list){
            System.out.println(linkMan);
        }

        transaction.commit();
    }

    @Test
    /**
     * 条件查询
     * */
    public void test05(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = builder.createQuery(Customer.class);
        Root root = criteriaQuery.from(Customer.class);
        criteriaQuery.select(root);
        /**
         * =  : equal
         * >  : gt
         * >= : ge
         * <  : lt
         * <= : le
         * <> :  notEqual  不等于
         * like , in , and , or
         * */
        //添加1个条件,equal表示等于: cust_source="百度推广"
        criteriaQuery.where(builder.equal(root.get("cust_source"),"百度推广"));
        //添加2个条件
        //使用or的查询的方式
        //criteriaQuery.where(builder.or(builder.like(root.get("cust_name"),"李%")));
        criteriaQuery.where(builder.like(root.get("cust_name"),"李%"));
        Query query = session.createQuery(criteriaQuery);
        List<Customer> list = query.list();
        for(Customer customer : list){
            System.out.println(customer);
        }
        transaction.commit();
    }

    @Test
    /**
     * 统计查询
     * */
    public void test06(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = builder.createQuery(Customer.class);
        Root<Customer> root = criteriaQuery.from(Customer.class);
        criteriaQuery.select(builder.count(root.get("cust_id")));
        Query query = session.createQuery(criteriaQuery);
        Long num = (Long) query.uniqueResult();

        System.out.println(num);
        transaction.commit();
    }

    @Test
    /**
     * 查询多个字段
     * */
    public void test07(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery criteriaQuery = builder.createQuery(Customer.class);
        Root root = criteriaQuery.from(Customer.class);

        //查询指定字段 : select cust_name,cust_source from cst_custer;
        criteriaQuery.multiselect(root.get("cust_name"),root.get("cust_source"));
        //根据条件查询指定字段  : select cust_name,cust_source from cst_custer where cust_id = 1;
        //criteriaQuery.where(builder.equal(root.get("cust_id"),1l));

        Query query = session.createQuery(criteriaQuery);
        List<Customer> list = query.list();
        for(Customer customer : list){
            System.out.println(customer);
        }

        transaction.commit();
    }

    @Test
    /**
     * 离线条件查询
     * */
    public void test08(){
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Customer.class);
        detachedCriteria.add(Restrictions.like("cust_name","李%"));
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Criteria criteria = detachedCriteria.getExecutableCriteria(session);
        List<Customer> list = criteria.list();
        for(Customer customer : list){
            System.out.println(customer);
        }

    }

    /**
     * 交叉连接: 查询两个表所有信息
     * SELECT * FROM cst_customer1,cst_linkman1;
     *
     * 内连接: 查询两个表有关联的共同数据
     * 	显示内连接:
     * 	SELECT * FROM cst_customer1 c INNER JOIN cst_linkman1 l ON c.cust_id = l.lkm_cust_id;
     *
     * 	隐式内连接:
     * 	SELECT * FROM cst_customer1 c ,cst_linkman1 l WHERE c.cust_id = l.lkm_cust_id;
     *
     * 外连接:
     * 	左外连接:不仅查出两个表中有关联的数据,还会将左边表中的数据也查出来
     * 	SELECT * FROM cst_customer1 c LEFT OUTER JOIN cst_linkman1 l ON c.cust_id = l.lkm_cust_id;
     *
     * 	右外连接:不仅查出两个表中有关联的数据,还会将右边表中的数据也查出来
     * 	SELECT * FROM cst_customer1 c RIGHT OUTER JOIN cst_linkman1 l ON c.cust_id = l.lkm_cust_id;
     *
     * */


}
