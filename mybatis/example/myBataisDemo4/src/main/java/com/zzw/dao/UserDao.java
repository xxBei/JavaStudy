package com.zzw.dao;

import com.zzw.domain.QueryVo;
import com.zzw.domain.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();

    List<User> findAllByName(String name);

    List<User> findInfoByName(User user);

    List<User> findOtherInfoById(QueryVo queryVo);
}
