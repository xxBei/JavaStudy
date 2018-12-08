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
}
