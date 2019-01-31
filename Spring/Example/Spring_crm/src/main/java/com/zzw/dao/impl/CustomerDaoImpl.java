package com.zzw.dao.impl;

import com.zzw.dao.CustomerDao;
import com.zzw.domain.Customer;
import com.zzw.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public void saveCustomer(Customer customer) {
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        session.save(customer);

        System.out.println("CustomerDaoImpl执行了...");
        transaction.commit();
    }
}
