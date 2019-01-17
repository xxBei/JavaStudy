package com.zzw.service.Impl;

import com.zzw.dao.CustomerDao;
import com.zzw.dao.Impl.CustomerDaoImpl;
import com.zzw.domain.Customer;
import com.zzw.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public List<Customer> find() {
        CustomerDao customerDao = new CustomerDaoImpl();
        return customerDao.find();
    }
}
