package com.zzw.service;

import com.zzw.domain.StudentInfo;

import java.util.List;

public interface StudentService {
    List<StudentInfo> findAll(StudentInfo studentInfo);

    void addStudent(StudentInfo studentInfo);

    List<StudentInfo> findStuByStuId(StudentInfo studentInfo);

    void updateStudentT(StudentInfo studentInfo);
}
