package com.zzw.demo1.impl;

import com.zzw.demo1.UserDao;
import com.zzw.demo1.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service("UserService")//Service用于Service层
public class UserServiceImpl implements UserService {

    /*@Autowired//表示设置了对象,注入DAO
    @Qualifier(value = "UserDao")//强制和UserDao进行关联*/

    @Resource(name="UserDao") //完成对象类型的属性注入.并强制要求按照名称完成属性注入,它可以替代上面两个注解
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("UserServiceImpl方法执行了...");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("UserDao");
        userDao.save();
    }
}
