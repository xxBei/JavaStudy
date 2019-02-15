package com.zzw.ssh.dao;

import com.zzw.ssh.domain.Customer;

/**
 * 客户管理的持久层接口
 * */
public interface CustomerDao {

    void save(Customer customer);
}
