package com.zzw.dao;

import java.sql.*;

public class connector {
    public static void main(String[] args)  {
        //声明Connection
        Connection conn;
        PreparedStatement ps;
        ResultSet rs;
        //驱动程序名
        String driver = "com.mysql.cj.jdbc.Driver";
        //URL指向要访问的数据库名test01
//        String url = "jdbc:mysql://localhost:3306/test01";
        String url = "jdbc:mysql://localhost/stumanager?userSSL=true&useUnicode=true" +
                "&characterEncoding" +
                "=UTF8&serverTimezone=GMT";
        String user = "root";
        String password = "root";
        //遍历查询结果集


        try {
            //加载驱动程序
            Class.forName(driver);
            //1.getConnection()方法，连接MySQL数据库！！
            conn = DriverManager.getConnection(url,user,password);
            //用于测试数据库是否连接成功
            if(!conn.isClosed()){
                System.out.println("数据库连接成功");
            }
            //2.创建PreparedStatement类对象，用来执行SQL语句！！
            String sql = "select * from u_manager where id = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"1");
            rs = ps.executeQuery();

            while (rs.next()){

                int id = rs.getInt("id");
                String username = rs.getString("username");
                String passWord = rs.getString("password");
                String gender = rs.getInt("gender")==1?"男":"女";
                String address = rs.getString("address");

                System.out.println(id+"\t"+username+"\t"+passWord+"\t"+gender+"\t"+address);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
