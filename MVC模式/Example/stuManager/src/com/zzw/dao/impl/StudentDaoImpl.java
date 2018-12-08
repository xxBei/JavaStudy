package com.zzw.dao.impl;

import com.zzw.Utils.JDBCUtils;
import com.zzw.dao.StudentDao;
import com.zzw.domain.Student;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());

    @Override
    public List<Student> findAll() throws SQLException {
        String sql = "select * from stu";
        List<Student> list = queryRunner.query(sql,new BeanListHandler<Student>(Student.class));
        return list;

    }
}
