package com.zzw.hibernate.demo2;

import com.zzw.Utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Hib_queryDemo01 {

    @Test
    public void queryTest01(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        //使用query方法查询数据库   简单查询
        //String hql = "from cst_user";

        //这里使用的JPA-style 以前直接写问号方式不再支持  条件查询
        /*String hql = "from cst_user where username like ?0";
        Query query = session.createQuery(hql);
        //设置问号的参数
        query.setParameter(0,"刘%");*/

        //分页查询
        String hql = "from cst_user ";
        Query query = session.createQuery(hql);
        //设置从哪里开始查询
        query.setFirstResult(0);
        //设置最多显示几条数据
        query.setMaxResults(3);

        List<cst_user> list = query.list();
        for (cst_user cstuser : list){
            System.out.println(cstuser);
        }

        transaction.commit();

    }
}
