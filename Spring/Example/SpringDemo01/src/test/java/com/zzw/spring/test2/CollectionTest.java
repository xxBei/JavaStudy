package com.zzw.spring.test2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 集合的属性注入
 * */
public class CollectionTest {

    @Test
    public void test01(){
        //创建工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        CollectionBean collection = (CollectionBean) applicationContext.getBean("Collection");
        System.out.println(collection);
    }
}
