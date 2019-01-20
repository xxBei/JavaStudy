package com.zzw.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zzw.domain.Customer;
import com.zzw.service.CustomerService;
import com.zzw.service.Impl.CustomerServiceImpl;
import org.apache.struts2.ServletActionContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

    private Customer customer = new Customer();

    @Override
    public Customer getModel() {
        return customer;
    }


    /**
     * 查询客户列表
     * */
    public String find(){
        System.out.println("查询客户成功");
        //调用的业务层
        CustomerService service = new CustomerServiceImpl();
        List<Customer> list = service.find();
        //获取request,通过request存储list'
        ServletActionContext.getRequest().setAttribute("list",list);
        return "findSuccess";
    }

    /**
     * 跳转客户添加页面
     * */
    public String comeUI(){
        System.out.println("跳转客户添加页面");
        return "comeSuccess";
    }

    /**
     * 保存客户信息
     * */
    public String saveUI(){
        System.out.println(customer.getCust_name());
        CustomerService service = new CustomerServiceImpl();
        service.save(customer);
        //利用Struts2中的ServletActionContext对象获取request
        HttpServletRequest request = ServletActionContext.getRequest();
        request.setAttribute("result","保存客户成功");
        return "saveSuccess";
    }

    /**
     * 删除客户信息
     * */
    public String delete(){
        HttpServletRequest request = ServletActionContext.getRequest();
        long id = Integer.parseInt(request.getParameter("id"));
        CustomerService service = new CustomerServiceImpl();
        service.delete(id);
        //删完数据查询学生列表
        find();
        System.out.println("删除客户成功");
        return "findSuccess";
    }

    /**
     * 修改客户信息
     * */
    public String update(){
        HttpServletRequest request = ServletActionContext.getRequest();
        long id = Integer.parseInt(request.getParameter("id"));
        CustomerService service = new CustomerServiceImpl();
        Customer customer = service.findId(id);
        request.setAttribute("customer",customer);
        return "updateSuccess";
    }

    public String updateUI(){
        HttpServletRequest request = ServletActionContext.getRequest();
        long id = Integer.parseInt(request.getParameter("cust_id"));
        String cust_name = request.getParameter("cust_name");
        String cust_level = request.getParameter("cust_level");
        String cust_source = request.getParameter("cust_source");
        String cust_industry = request.getParameter("cust_industry");
        String cust_phone = request.getParameter("cust_phone");
        String cust_mobile = request.getParameter("cust_mobile");

        customer.setCust_name(cust_name);
        customer.setCust_level(cust_level);
        customer.setCust_source(cust_source);
        customer.setCust_industry(cust_industry);
        customer.setCust_phone(cust_phone);
        customer.setCust_mobile(cust_mobile);


        CustomerService service = new CustomerServiceImpl();
        service.update(id,customer);
        request.setAttribute("result","修改成功");
        return "updateUISuccess";
    }

}
