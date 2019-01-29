package com.zzw.spring.test.Impl;

import com.zzw.spring.test.UserDao;

public class UserHibernateImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("这是切换实现类UserHibernateImpl执行了...");
    }
}
