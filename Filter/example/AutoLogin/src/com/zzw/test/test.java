package com.zzw.test;

import com.zzw.dao.UserDao;
import com.zzw.dao.impl.UserImpl;
import com.zzw.domain.UserBean;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

public class test {

    @Test
    public void testMain() throws SQLException {

        UserBean user = new UserBean();
        user.setUname("admin");
        user.setUpassword("123456");

        UserDao dao = new UserImpl();

        UserBean userBean = dao.login(user);
        System.out.println(userBean.getUname());
    }
}