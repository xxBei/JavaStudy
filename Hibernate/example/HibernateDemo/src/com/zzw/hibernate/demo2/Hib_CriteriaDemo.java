package com.zzw.hibernate.demo2;

import com.zzw.Utils.HibernateUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import java.util.List;

public class Hib_CriteriaDemo {
    /**
     * Criteria : QBC (Query By Criteria)
     * 更加面向对象的一种查询方式
     * */

    @Test
    public void criteria01(){

        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();


        Criteria criteria = session.createCriteria(cst_user.class);
        //简单查询(查询全部信息)
        //List<cst_user> list = criteria.list();

        //条件查询 Restrictions.like表示匹配查询  Restrictions.eq表示等于
        //criteria.add(Restrictions.like("username","刘%"));

        //分页查询
        criteria.setFirstResult(0);
        criteria.setMaxResults(3);


        List<cst_user> list = criteria.list();
        for (cst_user cst_user : list){
            System.out.println(cst_user);
        }


        transaction.commit();
    }
}
