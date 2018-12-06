package com.zzw.DBUtilsTest;

import com.zzw.Dao.JDBCUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.jupiter.api.Test;

public class InsertTest {

    @Test
    public void insert(){
        try {
            //第一步：创建queryRunner对象，用来操作sql语句
            QueryRunner query = new QueryRunner(JDBCUtils.getDataSource());

            //第二步: 创建sql语句
            String sql = "insert into bank values(null,?,?)";

            /*
            * 第三步：执行sql语句,params:是sql语句的参数
            * 注意，给sql语句设置参数的时候，按照bank表中字段的顺序
            * */
            query.update(sql,"张飞",3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
