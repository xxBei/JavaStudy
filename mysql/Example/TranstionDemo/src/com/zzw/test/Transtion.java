package com.zzw.test;

import com.zzw.Util.JDBCUtil;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Transtion {

    @Test
    public void testTranstion(){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtil.getConn();

            conn.setAutoCommit(false);

            String sql = "update bank set money= money - ? where id=?";
            ps = conn.prepareStatement(sql);

            ps.setInt(1,100);
            ps.setInt(2,1);
            ps.executeUpdate();

            int a = 10/0;

            ps.setInt(1,-100);
            ps.setInt(2,2);
            ps.executeUpdate();


            conn.commit();
        } catch (SQLException e) {
            try {

                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }
}
