package com.zzw.service.impl;

import com.zzw.dao.TeacherDao;
import com.zzw.domain.Student;
import com.zzw.service.TeacherService;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {

    private TeacherDao teacherDao;

    public void setTeacherDao(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void findAll() {
        teacherDao.findAll();
        System.out.println("TeacherService 中 findAll方法 查询所有学生...");
    }
}
