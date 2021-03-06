package com.zzw.dao;

import com.zzw.domain.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {

    //接口里面定义的成员都是常量
    //一页显示多少条数据
    int PAGE_SIZE = 5;

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
    void updateStu(String sname,String gender,String phone,String birthday,String info,int sid) throws SQLException;

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

    /**
     * 根据姓名模糊查询
     *
     * */
    List<Student> findName(String sname,String gender) throws SQLException;

    /**
     * 分页查询,查询当页的数据
     * @param currentPage 页数
     * */
    List<Student> findStudentByPage(int currentPage) throws SQLException;

    /**
     * 查询总共有多少条数据
     * */

    int findCount() throws SQLException;
}

