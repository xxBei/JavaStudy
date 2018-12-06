package com.zzw.Dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCUtils {

    /**获取c3p0连接池对象*/
    static ComboPooledDataSource cpds = new ComboPooledDataSource();

    /**
     * 获取数据库连接对象
     * */
    public static Connection getConnection() throws SQLException {
        return cpds.getConnection();
    }

    /**
     * 获取c3p0连接池对象
     * */
    public static DataSource getDataSource(){
        return cpds;
    }
}
