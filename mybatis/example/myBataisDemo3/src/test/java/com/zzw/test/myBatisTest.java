package com.zzw.test;

import com.zzw.dao.UserDao;
import com.zzw.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class myBatisTest {

    private InputStream in;
    private SqlSession session;
    private UserDao userDao;

    /**
     * 将读取文件和创建SqlSession初始化时加载完毕
     * */
    @Before
    public void init() throws Exception{
        //读取配置文件
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //开启Session
        session = factory.openSession();
        //使用SqlSection创建Dao的动态接口代理
        userDao = session.getMapper(UserDao.class);
    }

    /**
     * 在结束是关闭资源
     * */
    @After
    public void destroy() throws Exception {
        //事物提交
        session.commit();
        session.close();
        in.close();
    }

    /**
     * 查询所有信息
     * */
    @Test
    public void findAll() {
        List<User> list = userDao.findAll();
        for (User user: list) {
            System.out.println(user);
        }
    }

    /**
     * 插入信息
     * */
    @Test
    public void saveTest(){
        User user = new User();
        user.setUser_name("罗技");
        user.setUser_password("zzz123");

        //调用UserDao中的插入方法
        userDao.insertInfo(user);

    }

}