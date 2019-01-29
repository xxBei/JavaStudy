package com.zzw.spring.test;

import com.zzw.spring.test.Impl.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    /**
     * 这是传统模式调用
     * */
    @Test
    public void test01(){
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.setName("张三");
        userDao.save();
    }

    /**
     * 这是使用Spring的方式调用
     * 使用这种方式的好处是,可以在不改变源代码的基础上,只需要改变配置文件,即可实现更换实现类
     * */
    @Test
    public void test02(){
        //引入配置文件,或者说是创建Spring工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //找到配置文件中的id名
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        //调用save方法
        userDao.save();
    }
}
