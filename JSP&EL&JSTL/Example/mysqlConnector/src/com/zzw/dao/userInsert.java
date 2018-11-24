package com.zzw.dao;

import com.zzw.Util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class userInsert {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtil.getConn();
            String sql = "insert into u_manager(username,password,gender,address) values(?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"李白");
            ps.setString(2,"123");
            ps.setInt(3,1);
            ps.setString(4,"长安");
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}













