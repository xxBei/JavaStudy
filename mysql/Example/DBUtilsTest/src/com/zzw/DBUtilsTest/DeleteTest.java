package com.zzw.DBUtilsTest;

import com.zzw.Dao.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class DeleteTest {

    @Test
    public void delete() throws SQLException {
        QueryRunner query = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "delete from bank where id=?";
        query.update(sql,5);
    }
}
