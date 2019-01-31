package com.zzw.service.impl;

import com.zzw.dao.CustomerDao;
import com.zzw.domain.Customer;
import com.zzw.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void saveCustomer(Customer customer) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        CustomerDao customerDao = (CustomerDao) applicationContext.getBean("CustomerDao");
        customerDao.saveCustomer(customer);
        System.out.println("CustomerServiceImpl执行了...");
    }
}
