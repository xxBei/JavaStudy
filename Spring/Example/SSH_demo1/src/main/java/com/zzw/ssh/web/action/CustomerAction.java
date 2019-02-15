package com.zzw.ssh.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zzw.ssh.domain.Customer;
import com.zzw.ssh.service.CustomerService;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * 客户管理的Action类
 * */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {

    private Customer customer = new Customer();

    @Override
    public Customer getModel() {
        return customer;
    }

    /**
     * 导入struts2-spring-plugin.jar 会自动开启注入,所以只需要如下配置即可
     * 方法一:
     *      使用注解则不需要set方法
     * 方法二:
     *      写set不需要注解
     * */
    //注入CustomerService
    //@Resource(name = "customerService")
    private CustomerService customerService;

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    public String comeUI(){
        //跳转到添加页面
        return "comeSuccess";
    }

    public String saveUI(){
        //如果web层没有使用Struts2,获取业务层必须如写进行编写(传统模式)
        /*WebApplicationContext applicationContext =
                WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());

        CustomerService customerService = (CustomerService) applicationContext.getBean("CustomerService");
        customerService.save();*/

        /**
         * 进行Spring和Struts2整合
         * 引入 struts-spring-plugin.jar
         * */

        System.out.println("CustomerAction已启动...");
        customerService.save(customer);
        return "saveUISuccess";
    }

    public String find(){
        System.out.println("查询客户信息已启动....");
        List<Customer> list = customerService.findAll();
        ActionContext.getContext().put("list",list);//向页面传递一个list
        System.out.println(list);
        return "findSuccess";
    }
}
