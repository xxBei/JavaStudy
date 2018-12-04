package com.zzw.DBPCDemo1;
import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DBPCDemo01 {

    /**
     * 使用DBCP连接池中的BasicDataSource
     * 需要引入
     *      commons-dbcp2.jar
     *      commons-logging.jar
     *      commons-pool2.jar
     * 三个jar包
     * */
    @Test
    public void DBPCtest(){
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            BasicDataSource ds = new BasicDataSource();
            ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
            ds.setUrl("jdbc:mysql://localhost/stumanager?userSSL=true&useUnicode=true&characterEncoding=UTF8&serverTimezone=GMT");
            ds.setUsername("root");
            ds.setPassword("root");

            conn = ds.getConnection();
            String sql = "select * from stu_list";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.release(conn,ps,rs);
        }

    }
}
