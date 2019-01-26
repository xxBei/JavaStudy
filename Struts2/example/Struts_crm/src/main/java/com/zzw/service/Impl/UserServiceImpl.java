package com.zzw.service.Impl;

import com.zzw.dao.Impl.UserDaoImpl;
import com.zzw.dao.UserDao;
import com.zzw.domain.User;
import com.zzw.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User Login(User user) {
        UserDao dao = new UserDaoImpl();
        User users = dao.Login(user);
        return users;
    }
}
