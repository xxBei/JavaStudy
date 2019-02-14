package com.zzw.ssh.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zzw.ssh.domain.Customer;

/**
 * 客户管理的Action类
 * */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

    private Customer customer = new Customer();

    @Override
    public Customer getModel() {
        return customer;
    }
}
