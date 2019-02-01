package com.zzw.demo2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2 {

    @Test
    public void test1(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        CustomerService customerService1 = (CustomerService) applicationContext.getBean(
                "CustomerService");
        System.out.println(customerService1);

        CustomerService customerService2 = (CustomerService) applicationContext.getBean(
                "CustomerService");
        System.out.println(customerService2);
        applicationContext.close();
    }
}
