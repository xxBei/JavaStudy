package com.zzw.spring.test.Impl;

import com.zzw.spring.test.UserDao;

public class UserDaoImpl implements UserDao {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("UserDaoImpl执行了..."+name);
    }
}
