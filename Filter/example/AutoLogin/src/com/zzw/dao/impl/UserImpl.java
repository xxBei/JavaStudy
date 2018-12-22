package com.zzw.dao.impl;

import com.zzw.Utils.JDBCUtils;
import com.zzw.dao.UserDao;
import com.zzw.domain.UserBean;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserImpl implements UserDao {

    QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDateSource());

    @Override
    public UserBean login(UserBean user) throws SQLException {
        String sql = "select * from user where uname=? and upassword=?";
        return queryRunner.query(sql,new BeanHandler<UserBean>(UserBean.class),
                user.getUname(), user.getUpassword());
    }


}