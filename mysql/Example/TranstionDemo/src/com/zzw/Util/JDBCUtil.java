package com.zzw.Util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCUtil {
    static String driver = null;
    static String url = null;
    static String username = null;
    static String password = null;

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

    public static Connection getConn(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url,username,password);
            Class.forName(driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
