package com.zzw.service;

import com.zzw.domain.TeacherInfo;

import java.util.List;

public interface TeacherService {

    void findAll();

    List<TeacherInfo> findByUsername(String th_username,String th_password);

    void registeredTeacher(TeacherInfo teacherInfo);
}
