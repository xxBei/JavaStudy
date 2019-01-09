package com.zzw.test;

import com.zzw.Utils.HibernateUtils;
import com.zzw.domain.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.Test;

public class lazyDemo {

    @Test
    public void test01(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = session.load(Customer.class,1l);
        System.out.println(customer);

        transaction.commit();
    }
}
