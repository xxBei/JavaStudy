package com.zzw.dao;

import com.zzw.domain.StudentInfo;

import java.util.List;

public interface StudentDao {

    List<StudentInfo> findAll(StudentInfo studentInfo);
}
