package com.zzw.DBPCDemo1;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {
    static String driver;
    static String url;
    static String username;
    static String password;

    static {
        try {
            Properties properties = new Properties();
            InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");
            properties.load(is);
            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            username = properties.getProperty("username");
            password = properties.getProperty("password");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 获取连接
     * */
    public static Connection getConn(){
        Connection conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,username,password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    /**
     * 释放资源
     * @param rs
     * @param ps
     * @param conn
     * */
    public static void release(Connection conn , PreparedStatement ps , ResultSet rs){
        closeRs(rs);
        closePs(ps);
        closeConn(conn);
    }
    public static void release(Connection conn , PreparedStatement ps){
        closePs(ps);
        closeConn(conn);
    }
    private static void closeRs(ResultSet rs){
        try {
            if(rs!=null){
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            rs = null;
        }
    }
    private static void closePs(PreparedStatement ps){
        try {
            if(ps!=null){
                ps.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ps = null;
        }
    }
    private static void closeConn(Connection conn){
        try {
            if(conn!=null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            conn = null;
        }
    }
}
