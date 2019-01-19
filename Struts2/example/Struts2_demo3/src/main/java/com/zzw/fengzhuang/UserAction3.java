package com.zzw.fengzhuang;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zzw.domain.User;

/**
 * 封装数据: 使用页模型驱动方法,(这是开发中最常用的方式)
 * */
public class UserAction3 extends ActionSupport implements ModelDriven<User> {

    //模型驱动使用的对象,前提必须手动实例化对象
    private User user = new User();//使用模型驱动,必须手动实例化需要获取参数的User类

    @Override
    //模型驱动需要使用的方法
    public User getModel() {
        return user;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getAge());
        System.out.println(user.getBirthday());
        System.out.println(user.getSalary());
        return NONE;
    }
}
