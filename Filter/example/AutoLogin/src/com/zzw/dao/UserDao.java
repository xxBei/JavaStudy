package com.zzw.dao;

import com.zzw.domain.UserBean;

import java.sql.SQLException;

public interface UserDao {

    UserBean login(UserBean user) throws SQLException;
}
