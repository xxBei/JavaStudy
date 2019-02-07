package com.zzw.demo1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Spring AOP入门
 * */
//使用Junit默认写法
@RunWith(SpringJUnit4ClassRunner.class)
//加载配置文件
@ContextConfiguration("classpath:applicationContext.xml")
public class demo1 {

    @Resource(name = "ProductDao")
    private ProductDao productDao;

    /**
     * 基于junit的方式进行测试
     * */
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        ProductDao productDao = (ProductDao) applicationContext.getBean("ProductDao");
        productDao.save();
        productDao.delete();
        productDao.update();
        productDao.find();

    }

    /**
     * Spring整合Junit
     * */
    @Test
    public void test2(){
        productDao.save();
        productDao.delete();
        productDao.update();
        productDao.find();
    }

}
