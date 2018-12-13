package com.zzw.service;

import com.zzw.domain.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {

    List<Student> findAll() throws SQLException;

    void insertStuInfo(String sname,int gender,String phone,String birthday,String info) throws SQLException;

    void updateStu(String sname,String gender,String phone,String birthday,String info,int sid) throws SQLException;

    List<Student> findOther(int sid) throws SQLException;

    void deleteStudent(int sid) throws SQLException;

    List<Student> findName(String sname,String gender) throws SQLException;
}
