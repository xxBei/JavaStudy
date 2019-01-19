package com.zzw.fengzhuang;

import com.opensymphony.xwork2.ActionSupport;
import com.zzw.domain.User;

/**
 * 封装数据: 使用页面提供表达式方法
 * 需要在 action实现类中创建 User,并实现他的 get和 set方法
 * 然后在页面(jsp)中的name上添加 User的名称 (name=user.username),注意.username是User类中的某个属性
 * 这种方法代码量少,也简单
 * */
public class UserAction2 extends ActionSupport {

    //实现get和set方法后,就已经实现了数据的获取和封装
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
