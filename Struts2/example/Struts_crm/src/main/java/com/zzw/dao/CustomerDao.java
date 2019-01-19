package com.zzw.dao;

import com.zzw.domain.Customer;

import java.util.List;

public interface CustomerDao {
    //查询所有客户信息
    List<Customer> find();

    void save(Customer customer);
}
