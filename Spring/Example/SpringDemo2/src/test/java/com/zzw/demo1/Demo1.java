package com.zzw.demo1;

import com.zzw.demo1.impl.UserDaoImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo1 {

    @Test
    /**
     * 传统方式
     * */
    public void test1(){
        UserDao dao = new UserDaoImpl();
        dao.save();
    }

    /**
     * 注解方式
     * */
    @Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("UserDao");
        userDao.save();
    }

    /**
     * 传统方式设置值, 必须有set方法才可以设置值
     * */
    @Test
    public void test01(){
        UserDaoImpl dao = new UserDaoImpl();
        //dao.setName("张三");
        dao.save();
    }

    /**
     * 注解方式设置值
     * */
    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("UserDao");

        userDao.save();
    }


    @Test
    public void test03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        UserService service = (UserService) applicationContext.getBean("UserService");
        service.save();
    }

}
