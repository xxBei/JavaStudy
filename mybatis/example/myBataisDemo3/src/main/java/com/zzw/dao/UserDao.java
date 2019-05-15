package com.zzw.dao;

import com.zzw.domain.User;

import java.util.List;

public interface UserDao {

    /**
     * 查询所有信息
     * */
    List<User> findAll();

    /**
     * 插入信息
     * */
    void insertInfo(User user);
}
