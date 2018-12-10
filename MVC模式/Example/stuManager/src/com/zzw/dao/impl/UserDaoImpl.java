package com.zzw.dao.impl;

import com.zzw.Utils.JDBCUtils;
import com.zzw.dao.UserDao;
import com.zzw.domain.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements UserDao {

    QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
    @Override
    public List<User> user_login() throws SQLException {
        String sql = "select * from user";
        List<User> list = queryRunner.query(sql,new BeanListHandler<>(User.class));
        return list;
    }
}
