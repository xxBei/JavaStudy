package com.zzw.dao;

import com.zzw.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Stu_update {
    public void UpdateSql(String id,String name,int age,String grade,String gender,String number,
                          String address){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtil.getConn();
            String sql = "update stu_list set name=?,age=?,grade=?,gender=?,number=?,address=? where " +
                    "id=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,name);
            ps.setInt(2,age);
            ps.setString(3,grade);
            ps.setString(4,gender);
            ps.setString(5,number);
            ps.setString(6,address);
            ps.setString(7,id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
