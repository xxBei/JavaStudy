package com.zzw.dao;

import com.zzw.domain.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    List<User> user_login() throws SQLException;
}
