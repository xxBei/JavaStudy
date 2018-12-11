package com.zzw.service;

import com.zzw.domain.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {

    List<Student> findAll() throws SQLException;

    void insertStuInfo(String sname,int gender,String phone,String birthday,String info) throws SQLException;
}
