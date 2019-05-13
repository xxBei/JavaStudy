package com.zzw;

import com.zzw.dao.UserDao;
import com.zzw.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class test {

    @Test
    public void test01() throws IOException {
//        读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
//        创建SqlSectionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
//        创建session
        SqlSession session = factory.openSession();
//        使用动态代理执行UserDao中方法
        UserDao userDao = session.getMapper(UserDao.class);
//        读取数据
        List<User> list = userDao.findAll();
        for (User user: list) {
            System.out.println(user);
        }
//        释放资源
        session.close();
        in.close();


    }
}
