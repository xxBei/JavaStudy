package com.zzw.fengzhuang;

import com.opensymphony.xwork2.ActionSupport;
import com.zzw.domain.User;

import java.util.Date;

/**
 * 封装数据: 使用set方式
 * Struts2 在这里帮你将数据类型自动的转换好了,不需要再去设置类型转换了
 * 这种方法只适用于数据量少的时候,数据量过多的情况下,不适合使用,因为需要设置的set方法太多了
 * */
public class UserAction1 extends ActionSupport {

    private String username;
    private String password;
    private Integer age;
    private Date birthday;
    private Double salary;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String execute() throws Exception {
        //接收数据
        System.out.println(username+"--"+password+"--"+age+"--"+birthday+"--"+salary);
        //封装数据,将数据放入到 User类中 (将接收的数据放入到User类中)
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(age);
        user.setBirthday(birthday);
        user.setSalary(salary);

        return NONE;
    }
}
