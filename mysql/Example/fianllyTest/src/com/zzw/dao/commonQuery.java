package com.zzw.dao;

import com.zzw.test01.User;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class commonQuery {

    @Test
    public void test(){
        User user = query("select * from bank", new ResultSetHandler<User>() {
            @Override
            public User handle(ResultSet rs) {
                User user = new User();
                try{
                    while (rs.next()){
                        String name = rs.getString("name");
                        int money = rs.getInt("money");

                        user.setName(name);
                        user.setMoney(money);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println(user);
                return user;
            }
        });
    }

    public <T> T query(String sql, ResultSetHandler<T> handler, Object ... args){
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            //将查询的结果集交给调用者去处理,返回封装数据
            User user = (User) handler.handle(rs);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
