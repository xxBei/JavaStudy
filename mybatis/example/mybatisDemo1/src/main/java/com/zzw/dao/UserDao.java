package com.zzw.dao;

import com.zzw.domain.User;

import java.util.List;

public interface UserDao {
    /**
     * 查询所有
     * */
    List<User> findAll();
}
