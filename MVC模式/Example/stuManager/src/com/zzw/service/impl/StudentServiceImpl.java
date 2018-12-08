package com.zzw.service.impl;

import com.zzw.dao.StudentDao;
import com.zzw.dao.impl.StudentDaoImpl;
import com.zzw.domain.Student;
import com.zzw.service.StudentService;

import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> findAll() throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        return dao.findAll();
    }
}
