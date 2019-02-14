package com.zzw.ssh.service.impl;

import com.zzw.ssh.domain.Customer;
import com.zzw.ssh.service.CustomerService;

/**
 * 客户管理的业务层的实现类
 * */
public class CustomerServiceImpl implements CustomerService {
    @Override
    public void save(Customer customer) {
        System.out.println("CustomerService已启动...");
    }
}
