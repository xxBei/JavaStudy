package com.zzw.DBUtilsTest;

import com.zzw.Dao.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class UpdateTest {

    @Test
    public void update(){

        QueryRunner query = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "update bank set money=? where id=?";
        try {
            query.update(sql,2500,4);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
