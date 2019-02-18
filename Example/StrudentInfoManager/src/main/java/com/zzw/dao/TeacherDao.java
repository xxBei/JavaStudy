package com.zzw.dao;

import com.zzw.domain.TeacherInfo;

import java.util.List;

public interface TeacherDao {
    void findAll();

    List<TeacherInfo> findByUsername(String th_username,String th_password);
}
