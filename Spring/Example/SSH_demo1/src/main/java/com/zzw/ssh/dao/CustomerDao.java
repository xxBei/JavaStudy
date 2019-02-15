package com.zzw.ssh.dao;

import com.zzw.ssh.domain.Customer;

import java.util.List;

/**
 * 客户管理的持久层接口
 * */
public interface CustomerDao {

    void save(Customer customer);

    List<Customer> findAll();
}
