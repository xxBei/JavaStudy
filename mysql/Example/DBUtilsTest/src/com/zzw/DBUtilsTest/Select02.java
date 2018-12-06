package com.zzw.DBUtilsTest;

import com.zzw.Dao.JDBCUtils;
import com.zzw.User.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

public class Select02 {

    QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
    /**
     * 查询单个数据
     * */
    @Test
    public void select(){

        String sql = "select * from bank where id=?";
        try {
            User user = queryRunner.query(sql,new BeanHandler<User>(User.class),2);
            System.out.println(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * 查询多个数据
     * */
    @Test
    public void select2(){
        String sql = "select * from bank";
        try {
            List<User> list = queryRunner.query(sql,new BeanListHandler<User>(User.class));

            for (User user: list) {
                System.out.println(user.getId()+"---"+user.getName()+"---"+user.getMoney());
            }
            //System.out.println(list);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
