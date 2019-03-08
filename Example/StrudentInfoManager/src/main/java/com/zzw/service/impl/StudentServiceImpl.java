package com.zzw.service.impl;

import com.zzw.dao.StudentDao;
import com.zzw.domain.StudentInfo;
import com.zzw.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }


    @Override
    public List<StudentInfo> findAll(StudentInfo studentInfo) {
        return studentDao.findAll(studentInfo);
    }

    @Override
    public void addStudent(StudentInfo studentInfo) {
        studentDao.addStudent(studentInfo);
    }
}
