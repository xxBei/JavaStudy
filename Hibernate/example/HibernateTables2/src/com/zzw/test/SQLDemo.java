package com.zzw.test;

import com.zzw.Utils.HibernateUtils;
import com.zzw.domain.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.List;

public class SQLDemo {
    @Test
    /**
     * 使用sql查询
     * */
    public void test01(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        /*NativeQuery sqlQuery = session.createSQLQuery("select * from cst_customer1");
        List<Object[]> list =sqlQuery.list();
        for(Object[] objects : list){
            System.out.println(Arrays.toString(objects));
        }*/

        NativeQuery sqlQuery = session.createSQLQuery("select * from cst_customer1");
        sqlQuery.addEntity(Customer.class);
        List<Customer> list = sqlQuery.list();

        for(Customer customer : list){
            System.out.println(customer);
        }
        transaction.commit();
    }
}
