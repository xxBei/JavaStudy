package com.zzw.dao;

import com.zzw.Util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class userUpdate {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;


        try {
            conn = JDBCUtil.getConn();
            String sql = "update u_manager set username=?,password=?,gender=?,address=? where id=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"貂蝉");
            ps.setString(2,"abc123");
            ps.setInt(3,0);
            ps.setString(4,"三国");
            ps.setInt(5,5);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}















