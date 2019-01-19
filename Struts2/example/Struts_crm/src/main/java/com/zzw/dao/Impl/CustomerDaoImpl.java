package com.zzw.dao.Impl;

import com.zzw.Utils.HibernateUtils;
import com.zzw.dao.CustomerDao;
import com.zzw.domain.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public List<Customer> find() {
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        List<Customer> list = session.createQuery("from Customer ").list();

        transaction.commit();
        return list;
    }

    @Override
    public void save(Customer customer) {
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        session.save(customer);

        transaction.commit();
    }
}
