package com.zzw.conn;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestPool {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    /**
     * 用于测试连接池中的返回连接
     * */
    @Test
    public void test(){
        try {
            //创建连接池对象
            MyDataSource dataSource = new MyDataSource();
            conn = dataSource.getConnection();
            String sql = "select * from pool_test";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("name")+":"+rs.getInt("garden"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //归还连接
            JDBCUtil.release(conn,ps,rs);
        }
    }
}
