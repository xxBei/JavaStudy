package com.zzw.Util;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {

    static String driver = null;
    static String url = null;
    static String user = null;
    static String password = null;

    static {

        try {
            InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
            Properties properties = new Properties();
            properties.load(is);
            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获取连接方法
    public static Connection getConn(){
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    //释放数据库方法
    public static  void release(Connection conn, PreparedStatement ps, ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(ps!=null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
