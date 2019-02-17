package com.zzw.dao.impl;

import com.zzw.dao.TeacherDao;
import com.zzw.domain.Student;

import java.util.List;

public class TeacherDaoImpl implements TeacherDao {

    @Override
    public void findAll() {
        System.out.println("TeacherDao 中 findAll方法 查询所有学生...");
    }
}
