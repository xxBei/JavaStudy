package com.zzw.ssh.service.impl;

import com.zzw.ssh.dao.CustomerDao;
import com.zzw.ssh.domain.Customer;
import com.zzw.ssh.service.CustomerService;

import java.util.List;

/**
 * 客户管理的业务层的实现类
 * */
public class CustomerServiceImpl implements CustomerService {

    //注入CustomerDao
    private CustomerDao customerDao;
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void save(Customer customer) {
        System.out.println("CustomerService 中的 save 已启动...");
        customerDao.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        System.out.println("CustomerService 中的 findAll 已启动...");
        return customerDao.findAll();
    }
}
