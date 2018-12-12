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

    @Override
    public void insertStuInfo(String sname, int gender, String phone, String birthday,
                              String info) throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        dao.insertStuInfo(sname,gender,phone,birthday,info);
    }

    @Override
    public void updateStu(String sname, int gender, String phone, String birthday,
                          String info,int sid) throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        dao.updateStu(sname,gender,phone,birthday,info,sid);

    }

    @Override
    public List<Student> findOther(int sid) throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        return dao.findOther(sid);
    }

    @Override
    public void deleteStudent(int sid) throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        dao.deleteStudent(sid);
    }
}
