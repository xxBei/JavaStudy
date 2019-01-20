package com.zzw.dao;

import com.zzw.domain.Customer;

import java.util.List;

public interface CustomerDao {
    //查询所有客户信息
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
