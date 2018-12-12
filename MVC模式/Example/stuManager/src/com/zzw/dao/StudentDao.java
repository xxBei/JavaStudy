package com.zzw.dao;

import com.zzw.domain.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    /**
     * 查询所有学生
     * @return list
     * */
    List<Student> findAll() throws SQLException;

    /**
     * 添加学生信息
     * */
    void insertStuInfo(String sname,int gender,String phone,String birthday,String info) throws SQLException;

    /**
     * 更新学生信息
     * */
    void updateStu(String sname,int gender,String phone,String birthday,String info,int sid) throws SQLException;

    /**
     * 根据sid查询学生信息
     * @return list
     * */
    List<Student> findOther(int sid) throws SQLException;

    /**
     * 删除学生
     * @param sid 学生id
     * */
    void deleteStudent(int sid) throws SQLException;
}
