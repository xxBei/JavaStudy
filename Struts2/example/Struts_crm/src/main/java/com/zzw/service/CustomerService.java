package com.zzw.service;

import com.zzw.domain.Customer;

import java.util.List;

public interface CustomerService {

    //查询客户列表
    List<Customer> find();

    //保存客户信息
    void save(Customer customer);

    //删除客户信息
    void delete(long id);

    //修改客户信息
    void update(long id,Customer customer);

    //根据id查询指定信息
    Customer findId(long id);
}
