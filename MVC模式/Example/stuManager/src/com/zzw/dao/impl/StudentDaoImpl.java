package com.zzw.dao.impl;

import com.zzw.Utils.JDBCUtils;
import com.zzw.Utils.TextUtils;
import com.zzw.dao.StudentDao;
import com.zzw.domain.Student;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());

    /**
     * 查询所有学生
     * */
    @Override
    public List<Student> findAll() throws SQLException {
        String sql = "select * from stu";
        List<Student> list = queryRunner.query(sql,new BeanListHandler<Student>(Student.class));
        return list;

    }

    /**
     * 查询学生根据sid
     * */
    @Override
    public List<Student> findOther(int sid) throws SQLException {
        String sql = "select * from stu where sid=?";
        return queryRunner.query(sql,new BeanListHandler<>(Student.class),sid);
    }

    /**
     * 插入学生信息
     * */
    @Override
    public void insertStuInfo(String sname,int gender,String phone,String birthday,String info) throws SQLException {
        String sql = "insert into stu values(null,?,?,?,?,?)";
        queryRunner.update(sql,sname,gender,phone,birthday,info);
    }

    /**
     * 更新学生信息
     * */
    @Override
    public void updateStu(String sname, String gender, String phone, String birthday,
                          String info,int sid) throws SQLException {
        String sql = "update stu set sname=?,gender=?,phone=?,birthday=?,info=? where sid=?";
        queryRunner.update(sql,sname,gender,phone,birthday,info,sid);
    }

    /**
     * 删除学生信息
     * */
    @Override
    public void deleteStudent(int sid) throws SQLException {
        String sql = "delete from stu where sid=?";
        queryRunner.update(sql,sid);
    }

    @Override
    public List<Student> findName(String sname,String gender) throws SQLException {

        /**
         * 分析：
         * 	如果只有姓名 ，select * from stu where sname like ? ;
         * 	如果只有性别 ， select * from stu where gender = ?
         *
         * 如果两个都有 select * from stu where sname like ? and gender=?
         *
         * 如果两个都没有就查询所有。
         *
         */
        //两个都没有查询所有
        String sql = "SELECT * FROM stu where 1=1 ";
        List<String> list = new ArrayList<>();

        //判断有没有姓名,有姓名,就拼接到sql语句中
        if(!TextUtils.isEmpty(sname)){
            sql = sql + " and sname like ?";
            list.add("%"+sname+"%");
        }

        //判断有没有性别，有的话，就组拼到sql语句里面。
        if(!TextUtils.isEmpty(gender)){
            sql = sql + " and gender=?";
            list.add(gender);
        }
        return queryRunner.query(sql,new BeanListHandler<>(Student.class),list.toArray());
    }

    @Override
    public List<Student> findStudentByPage(int currentPage) throws SQLException {
        String sql = "select * from stu limit ?,?";
        //第一个问号表示从跳过几行数据
        //第二个问号表示显示当页显示多少条数据
        /**
         * (当前页-1)*5
         * 0  , 5  --- 第一页 (1-1)*5
         * 5  , 5  --- 第二页 (2-1)*5
         * 10 , 5  --- 第三页
         * 15 , 5  --- 第四页
         * */
        return queryRunner.query(sql,new BeanListHandler<>(Student.class),
                (currentPage-1)*PAGE_SIZE,PAGE_SIZE);
    }

    @Override
    public int findCount() throws SQLException {
        String sql = "select count(*) from stu";
        //用于处理平均值或者是总的个数
        Long result = queryRunner.query(sql,new ScalarHandler<>());
        //将long转为int
        return result.intValue();
    }
}
