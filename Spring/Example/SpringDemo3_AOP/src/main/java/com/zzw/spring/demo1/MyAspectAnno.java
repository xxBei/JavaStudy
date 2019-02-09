package com.zzw.spring.demo1;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspectAnno {

    /**
     * 切面类:注解的切面类
     * */

    @Before(value = "execution(* com.zzw.spring.demo1.OrderDao.save(..))")
    public void before(){
        System.out.println("前置通知=============");
    }
}
