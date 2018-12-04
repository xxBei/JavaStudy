package com.zzw.C3P0;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C3P0Demo1 {
    @Test
    public void C3P0Test(){
        ComboPooledDataSource cpds = null;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            cpds = new ComboPooledDataSource();
            cpds.setDriverClass("com.mysql.cj.jdbc.Driver");
            cpds.setJdbcUrl("jdbc:mysql://localhost/stumanager?userSSL=true&useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT");
            cpds.setUser("root");
            cpds.setPassword("root");
            //要打开PreparedStatement池，还必须设置maxStatements 和/或maxStatementsPerConnection（默认为0）
            cpds.setMaxStatements(50);

            conn = cpds.getConnection();
            String sql = "select * from stu_list";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            cpds.close();
        }
    }
}
