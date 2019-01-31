package com.zzw.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zzw.domain.Customer;
import com.zzw.service.CustomerService;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

    private Customer customer = new Customer();

    @Override
    public Customer getModel() {
        return customer;
    }

    /*跳转到添加客户页面*/
    public String comeUI(){
        System.out.println("跳转到添加客户页面");
        return "comeSuccess";
    }

    /*保存客户信息*/
    public String saveUI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        CustomerService customerService = (CustomerService) applicationContext.getBean(
                "CustomerService");
        customerService.saveCustomer(customer);

        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("result","保存客户成功");
        return "saveSuccess";
    }
}
