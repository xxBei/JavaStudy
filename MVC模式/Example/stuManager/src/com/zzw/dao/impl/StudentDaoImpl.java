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

    @Override
    public void insertStuInfo(String sname,int gender,String phone,String birthday,String info) throws SQLException {
        String sql = "insert into stu values(null,?,?,?,?,?)";
        queryRunner.update(sql,sname,gender,phone,birthday,info);
    }

    @Override
    public void updateStu(String sname, int gender, String phone, String birthday,
                          String info,int sid) throws SQLException {
        String sql = "update stu set sname=?,gender=?,phone=?,birthday=?,info=? where sid=?";
        queryRunner.update(sql,sname,gender,phone,birthday,info,sid);
    }

    @Override
    public List<Student> findOther(int sid) throws SQLException {
        String sql = "select * from stu where sid=?";
        return queryRunner.query(sql,new BeanListHandler<>(Student.class),sid);
    }
}
