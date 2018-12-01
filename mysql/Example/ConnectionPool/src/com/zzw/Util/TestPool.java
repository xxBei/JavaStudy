package com.zzw.Util;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestPool {
    Connection conn = null;
    PreparedStatement ps = null;

    @Test
    public void test(){
        MyDataSource myDataSource = new MyDataSource();

        try {
            conn = myDataSource.getConnection();
            //String sql = "select * from pool_test";
            String sql = "INSERT INTO pool_test VALUES (?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1,null);
            ps.setString(2,"小乔");
            ps.setInt(3,0);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            //归还连接
            myDataSource.addBack(conn);
        }
    }
}
