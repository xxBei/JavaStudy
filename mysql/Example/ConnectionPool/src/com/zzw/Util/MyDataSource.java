package com.zzw.Util;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


/**
 * 数据库连接池
 *
 * 1. 创建10个连接
 *
 * 2. 来的程序通过getConnection来获取连接
 *
 * 3. 用完连接后,通过addBack进行归还连接
 *
 * 4. 扩容
 * */
public class MyDataSource implements DataSource {

    List<Connection> list = new ArrayList<>();

    public MyDataSource(){
        for(int i=0;i<10;i++){
            Connection conn = JDBCUtil.getConn();
            list.add(conn);
        }
    }

    @Override
    public Connection getConnection() throws SQLException {
        if(list.size() == 0){
            for(int i=0;i<5;i++){
                Connection conn = JDBCUtil.getConn();
                list.add(conn);
            }
        }
        Connection conn = list.remove(0);
        return conn;
    }

    public void addBack(Connection conn){
        list.add(conn);
    }

    @Override
    public Connection getConnection(String username, String password) throws SQLException {
        return null;
    }

    @Override
    public PrintWriter getLogWriter() throws SQLException {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter out) throws SQLException {

    }

    @Override
    public void setLoginTimeout(int seconds) throws SQLException {

    }

    @Override
    public int getLoginTimeout() throws SQLException {
        return 0;
    }

    @Override
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
