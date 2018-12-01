package com.zzw.conn;

import javax.sql.DataSource;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


/**
 * 连接池 -- DataSource
 * 创建 MyDataSource 会创建10个连接并存储到list中
 *
 * */
public class MyDataSource implements DataSource {

    List<Connection> list = new ArrayList<>();

    public MyDataSource() {
        //创建10个连接
        for(int i=0;i<10;i++){
            Connection conn = JDBCUtil.getConn();
            //将连接存储到集合中
            list.add(conn);
        }
    }

    //获取连接方法
    @Override
    public Connection getConnection() throws SQLException {
        //如果数组中的连接被用完,在创建5个存储到集合中
        if(list.size() == 0){
            for(int i=0;i<5;i++){
                Connection conn = JDBCUtil.getConn();
                list.add(conn);
            }
        }
        //将集合中的第一个连接移除并返回给调用者
        Connection conn = list.remove(0);
        //创建 ConnectionWrap 对象,该对象对 connection中的close方法进行了修改,将关闭连接改为返还连接
        Connection connWrop = new ConnectionWrap(conn,list);
        return connWrop;
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
