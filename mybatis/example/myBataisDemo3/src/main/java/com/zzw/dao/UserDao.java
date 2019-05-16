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

    /**
     * 更新信息
     * */
    void updateInfo(User user);

    /**
     * 根据id删除信息
     * */
    void deleteInfoById(Integer id);

    /**
     * 根据id查询信息(查询单个数据)
     * */
    User findInfoById(Integer id);

    /**
     * 根据姓名模糊查询
     * */
    List<User> findInfoByName(String username);

    /**
     * 查询总个数
     * */
    Integer findCountUser();

    /**
     * 插入新信息并获取插入的id名
     * */
     void findAllGetID(User user);
}
