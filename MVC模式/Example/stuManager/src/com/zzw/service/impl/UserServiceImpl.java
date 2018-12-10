package com.zzw.service.impl;

import com.zzw.dao.UserDao;
import com.zzw.dao.impl.UserDaoImpl;
import com.zzw.domain.User;
import com.zzw.service.UserLoginService;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserLoginService {

    @Override
    public List<User> user_login() throws SQLException {
        UserDao user = new UserDaoImpl();
        return user.user_login();
    }
}
