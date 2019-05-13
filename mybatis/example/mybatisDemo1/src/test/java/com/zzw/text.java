package com.zzw;

import com.zzw.dao.UserDao;
import com.zzw.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class text {

    /**
     * 入门案例
     * */
    @Test
   public void test01() throws Exception{
        //1.读取配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //2.创建SqlSectionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        //3.使用工厂创建SqlSection对象
        SqlSession session = factory.openSession();
        //4.使用SqlSection创建Dao的动态接口代理
        UserDao userDao = session.getMapper(UserDao.class);
        //5.使用代理对象执行方法
        List<User> list = userDao.findAll();
        for (User user: list) {
            System.out.println(user);
        }
        //6.释放资源
        session.close();
        in.close();
   }

}
