package com.zzw.C3P0;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class C3P0Demo2 {

    @Test
    public void C3P0Test(){
        ComboPooledDataSource cpds = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            cpds = new ComboPooledDataSource();
            conn = cpds.getConnection();
            String sql = "select * from stu_list";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            cpds.close();
        }

    }
}
