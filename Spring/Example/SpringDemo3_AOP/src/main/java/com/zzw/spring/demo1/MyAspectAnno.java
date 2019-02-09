package com.zzw.spring.demo1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspectAnno {

    /**
     * 切面类:注解的切面类
     * */


    /**
     * 前置通知
     * */
    @Before(value = "execution(* com.zzw.spring.demo1.OrderDao.save(..))")
    public void before(){
        System.out.println("前置通知=============");
    }

    /**
     * 后置通知
     * */
    @AfterReturning(value = "execution(* com.zzw.spring.demo1.OrderDao.delete(..))",returning =
            "result")
    public void afterReturning(Object result){
        System.out.println("后置通知============="+result);
    }

    /**
     * 环绕通知
     * */
    @Around(value = "execution(* com.zzw.spring.demo1.OrderDao.update(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知前=============");
        Object proceed = joinPoint.proceed();
        System.out.println("环绕通知后=============");
    }

    /**
     * 异常通知
     * */
    @AfterThrowing(value = "execution(* com.zzw.spring.demo1.OrderDao.find())",throwing = "throwable")
    public void afterthrowing(Throwable throwable){
        System.out.println("异常通知"+throwable.getMessage());
    }

    /**
     * 最终通知
     * */
    @After(value = "execution(* com.zzw.spring.demo1.OrderDao.find())")
    public void after(){
        System.out.println("最终通知============");
    }

}
