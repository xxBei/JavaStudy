package com.zzw.spring.test.Impl;

import com.zzw.spring.test.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("UserDaoImpl执行了...");
    }
}
