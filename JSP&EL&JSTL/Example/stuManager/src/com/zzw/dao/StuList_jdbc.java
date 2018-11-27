package com.zzw.dao;

import com.zzw.Demo.Student;
import com.zzw.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StuList_jdbc {
    public List<Student> findAll(){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        List<Student> list = new ArrayList<>();

        try {
            conn = JDBCUtil.getConn();
            String sql = "select * from stu_list ";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                Student stu = new Student();

                stu.setId(rs.getInt("id"));
                stu.setName(rs.getString("name"));
                stu.setAge(rs.getInt("age"));
                stu.setGrade(rs.getString("grade"));
                stu.setGender(rs.getInt("gender"));
                stu.setNumber(rs.getString("number"));
                stu.setAddress(rs.getString("address"));

                list.add(stu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return list;
    }
}
