package com.zzw.hibernate.demo2;

import com.zzw.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.jupiter.api.Test;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;


public class Hib_CriteriaBuilderDemo {
    /**
     *  Criteria 这个方法已经被CriteriaBuilder方法取代
     *  CriteriaBuilder的用法:
     * */

    @Test
    public void criteriaBuilder01(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        //获取CriteriaBuilder
        CriteriaBuilder builder = session.getCriteriaBuilder();
        //通过builder获取CriteriaQuery
        CriteriaQuery<cst_user> criteriaQuery = builder.createQuery(cst_user.class);
        //Root 对应着cst_user这个实体,from表示查询表
        Root<cst_user> root = criteriaQuery.from(cst_user.class);
        //查询实体(表)中全部字段
        criteriaQuery.select(root);
        //创建一个Query用于执行criteria查询,下面两个方法都可以使用
        //Query query = session.createQuery(criteriaQuery);
        Query<cst_user> query = session.createQuery(criteriaQuery);

        List<cst_user> list = query.list();
        for (cst_user cst_user:list){
            System.out.println(cst_user);
        }

        transaction.commit();
    }

    @Test
    public void criteriaBuilder02(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<cst_user> criteriaQuery = criteriaBuilder.createQuery(cst_user.class);
        Root<cst_user> root = criteriaQuery.from(cst_user.class);
        criteriaQuery.select(root);
        //条件查询 criteriaBuilder.equal() 表示 =
        criteriaQuery.where(criteriaBuilder.equal(root.get("user_id"),1));
        Query query = session.createQuery(criteriaQuery);
        List<cst_user> list = query.list();

        for(cst_user cst_user : list){
            System.out.println(cst_user);
        }

        transaction.commit();
    }

    @Test
    public void criteriaBuilder03(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<cst_user> criteriaQuery = criteriaBuilder.createQuery(cst_user.class);
        Root<cst_user> root = criteriaQuery.from(cst_user.class);
        criteriaQuery.select(root);
        //模糊查询  criteriaBuilder.like 表示 like "刘%"
        criteriaQuery.where(criteriaBuilder.like(root.get("username"),"刘%"));
        Query<cst_user> query = session.createQuery(criteriaQuery);
        List<cst_user> list = query.list();

        for(cst_user cst_user : list){
            System.out.println(cst_user);
        }

        transaction.commit();
    }

    @Test
    public void criteriaBuilder04(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<cst_user> criteriaQuery = criteriaBuilder.createQuery(cst_user.class);
        Root<cst_user> root = criteriaQuery.from(cst_user.class);
        criteriaQuery.select(root.get("username"));
        Query<cst_user> query = session.createQuery(criteriaQuery);
        query.setFirstResult(0);
        query.setMaxResults(4);
        List<cst_user> list = query.list();

        for(cst_user cst_user : list){
            System.out.println(cst_user);
        }

        transaction.commit();
    }
}
