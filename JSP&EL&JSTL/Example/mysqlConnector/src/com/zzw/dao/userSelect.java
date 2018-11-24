package com.zzw.dao;

import com.zzw.Util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class userSelect {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            //获取连接
            conn = JDBCUtil.getConn();
            //判断是否连接成功
            if(!conn.isClosed()){
                System.out.println("访问成功");
            }
//            String sql = "select * from u_manager where id=?";
            String sql = "select * from u_manager";
            ps = conn.prepareStatement(sql);
            //ps.setInt(1,1);
            rs = ps.executeQuery();
            //遍历
            while (rs.next()){
                int id = rs.getInt("id");
                String user = rs.getString("username");
                String password = rs.getString("password");
                String  gender = rs.getInt("gender")==1?"男":"女";
                String address = rs.getString("address");

                System.out.println(id+"\t"+user + "\t" + password+"\t"+gender+"\t"+address);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
