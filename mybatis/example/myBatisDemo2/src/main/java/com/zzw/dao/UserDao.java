package com.zzw.dao;

import com.zzw.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao {

    /**
     * 使用注解查询所有方法
     * */
    @Select("select * from user")
    List<User> findAll();
}
