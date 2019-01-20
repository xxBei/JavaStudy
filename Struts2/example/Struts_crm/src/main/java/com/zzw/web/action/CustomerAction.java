package com.zzw.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zzw.domain.Customer;
import com.zzw.service.CustomerService;
import com.zzw.service.Impl.CustomerServiceImpl;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

    private Customer customer = new Customer();

    @Override
    public Customer getModel() {
        return customer;
    }


    public String find(){
        System.out.println("成功");
        //调用的业务层
        CustomerService service = new CustomerServiceImpl();
        List<Customer> list = service.find();
        //获取request,通过request存储list'
        ServletActionContext.getRequest().setAttribute("list",list);
        return "findSuccess";
    }

    public String comeUI(){
        System.out.println("跳转客户添加页面");
        return "comeSuccess";
    }

    public String saveUI(){
        System.out.println(customer.getCust_name());
        CustomerService service = new CustomerServiceImpl();
        service.save(customer);
        //利用Struts2中的ServletActionContext对象获取request
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("customerAdd","保存成功");
        return "saveSuccess";
    }


}
