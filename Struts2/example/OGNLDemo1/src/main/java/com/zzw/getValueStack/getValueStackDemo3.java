package com.zzw.getValueStack;

import com.opensymphony.xwork2.ActionSupport;
import com.zzw.domain.User;

/**
 * 向值栈保存数据
 * 方法二: 在Action中提供属性的get方法
 * */
public class getValueStackDemo3 extends ActionSupport {

    private User user;

    public User getUser() {
        return user;
    }

    @Override
    public String execute() throws Exception {

        user = new User("张三","abc");

        return SUCCESS;
    }
}
