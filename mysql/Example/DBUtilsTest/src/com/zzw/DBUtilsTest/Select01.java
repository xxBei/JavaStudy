package com.zzw.DBUtilsTest;

import com.zzw.Dao.JDBCUtils;
import com.zzw.User.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Select01 {


    /**
     * 查询一条数据,该方法比较复杂
     * */
    @Test
    public void select(){
        QueryRunner query = new QueryRunner(JDBCUtils.getDataSource());
        String sql = "select * from bank where id=?";
        User user = new User();
        try {
            query.query(sql, new ResultSetHandler<User>() {

                @Override
                public User handle(ResultSet resultSet) throws SQLException {
                    while (resultSet.next()){
                        int id = resultSet.getInt("id");
                        String name = resultSet.getString("name");
                        int money = resultSet.getInt("money");

                        user.setId(id);
                        user.setName(name);
                        user.setMoney(money);
                    }
                    return user;
                }
            },1);

            System.out.println(user.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
