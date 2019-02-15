package com.zzw.ssh.service;

import com.zzw.ssh.domain.Customer;

/**
 * 客户管理的业务层的接口
 * */

public interface CustomerService {
    void save(Customer customer);
}
