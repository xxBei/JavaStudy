package com.zzw.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zzw.domain.Customer;
import com.zzw.service.CustomerService;
import com.zzw.service.Impl.CustomerServiceImpl;
import org.apache.struts2.ServletActionContext;

import java.util.List;

public class CustomerAction extends ActionSupport {

    public String find(){
        System.out.println("成功");
        //调用的业务层
        CustomerService service = new CustomerServiceImpl();
        List<Customer> list = service.find();
        //获取request,通过request存储list'
        ServletActionContext.getRequest().setAttribute("list",list);
        return "findSuccess";
    }

}
