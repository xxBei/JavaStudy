package com.zzw.spring.test1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarTest {

    @Test
    public void test01(){
        //创建工场
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "springConfig/applicationContext.xml");
        Car1 car1 = (Car1) applicationContext.getBean("Car1");
        System.out.println(car1);
    }

    @Test
    public void test02(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "springConfig/applicationContext.xml");
        Car2 car2 = (Car2) applicationContext.getBean("Car2");
        System.out.println(car2);
    }

    @Test
    public void test03(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "springConfig/applicationContext.xml");
        Car3 car3 = (Car3) applicationContext.getBean("Car3");
        System.out.println(car3);
    }
}
