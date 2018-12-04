package com.zzw.DBCPDemo2;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.junit.jupiter.api.Test;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class DBCPDemo2 {

    @Test
    public void DBCPTest(){
        PreparedStatement ps = null;
        Connection conn = null;
        ResultSet rs = null;

        try {
            Properties properties = new Properties();
            InputStream is = new FileInputStream("src//DBCP.properties");
            properties.load(is);
            BasicDataSourceFactory factory = new BasicDataSourceFactory();
            DataSource dataSource = factory.createDataSource(properties);

            conn = dataSource.getConnection();
            String sql = "select * from stu_list";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("name"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
