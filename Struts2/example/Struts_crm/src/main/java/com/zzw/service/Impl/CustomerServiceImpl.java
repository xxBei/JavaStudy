package com.zzw.service.Impl;

import com.zzw.dao.CustomerDao;
import com.zzw.dao.Impl.CustomerDaoImpl;
import com.zzw.domain.Customer;
import com.zzw.service.CustomerService;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    /**
     * 查询客户列表
     * */
    @Override
    public List<Customer> find() {
        CustomerDao customerDao = new CustomerDaoImpl();
        return customerDao.find();
    }

    /**
     * 保存客户信息
     * */
    @Override
    public void save(Customer customer) {
        CustomerDao customerDao = new CustomerDaoImpl();
        customerDao.save(customer);
    }

    /**
     * 删除客户信息
     * */
    @Override
    public void delete(long id) {
        CustomerDao customerDao = new CustomerDaoImpl();
        customerDao.delete(id);
    }

    /**
     * 修改客户信息
     * */
    @Override
    public void update(long id,Customer customer) {
        CustomerDao customerDao = new CustomerDaoImpl();
        customerDao.update(id,customer);
    }

    /**
     * 根据id查询指定信息
     * */
    @Override
    public Customer findId(long id) {
        CustomerDao customerDao = new CustomerDaoImpl();
        Customer customer = customerDao.findId(id);
        return customer;
    }
}
