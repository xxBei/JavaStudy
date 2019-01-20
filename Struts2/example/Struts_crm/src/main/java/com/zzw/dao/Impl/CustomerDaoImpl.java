package com.zzw.dao.Impl;

import com.zzw.Utils.HibernateUtils;
import com.zzw.dao.CustomerDao;
import com.zzw.domain.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    /**
     * 查询客户列表
     * */
    @Override
    public List<Customer> find() {
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        List<Customer> list = session.createQuery("from Customer ").list();

        transaction.commit();
        return list;
    }

    /**
     * 保存客户信息
     * */
    @Override
    public void save(Customer customer) {
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        session.save(customer);

        transaction.commit();
    }

    /**
     * 删除客户信息
     * */
    @Override
    public void delete(long id) {
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = session.get(Customer.class,id);
        session.delete(customer);

        transaction.commit();
    }

    /**
     * 修改客户信息
     * */
    @Override
    public void update(long id,Customer customer) {
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Customer customer1 = session.get(Customer.class, id);
        customer1.setCust_name(customer.getCust_name());
        customer1.setCust_level(customer.getCust_level());
        customer1.setCust_source(customer.getCust_source());
        customer1.setCust_industry(customer.getCust_industry());
        customer1.setCust_phone(customer.getCust_phone());
        customer1.setCust_mobile(customer.getCust_mobile());

        session.update(customer1);
        transaction.commit();
    }

    /**
     * 根据id查询指定信息
     * */
    @Override
    public Customer findId(long id) {
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        Customer customer = session.get(Customer.class,id);

        transaction.commit();
        return customer;
    }


}
