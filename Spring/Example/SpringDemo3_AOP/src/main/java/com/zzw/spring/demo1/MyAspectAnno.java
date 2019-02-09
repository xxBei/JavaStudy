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
    //@Before(value = "execution(* com.zzw.spring.demo1.OrderDao.save(..))")
    @Before("MyAspectAnno.savePointcut()")
    public void before(){
        System.out.println("前置通知=============");
    }

    /**
     * 后置通知
     * */
//    @AfterReturning(value = "execution(* com.zzw.spring.demo1.OrderDao.delete(..))",returning =
//            "result")
    @AfterReturning(value = "MyAspectAnno.deletePointcut()",returning = "result")
    public void afterReturning(Object result){
        System.out.println("后置通知============="+result);
    }

    /**
     * 环绕通知
     * */
    //@Around(value = "execution(* com.zzw.spring.demo1.OrderDao.update(..))")
    @Around("MyAspectAnno.updatePointcut()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕通知前=============");
        Object proceed = joinPoint.proceed();
        System.out.println("环绕通知后=============");
    }

    /**
     * 异常通知
     * */
    //@AfterThrowing(value = "execution(* com.zzw.spring.demo1.OrderDao.find())",throwing =
    //        "throwable")
    @AfterThrowing(value = "MyAspectAnno.findPointcut()",throwing = "throwable")
    public void afterthrowing(Throwable throwable){
        System.out.println("异常通知"+throwable.getMessage());
    }

    /**
     * 最终通知
     * */
    //@After(value = "execution(* com.zzw.spring.demo1.OrderDao.find())")
    @After("MyAspectAnno.findPointcut()")
    public void after(){
        System.out.println("最终通知============");
    }

    /**
     * 上面的注解方法,如果在后期需要修改的化,会比较困难,不如创建一个切入点的注解,修改起来会比较容易
     * */
    @Pointcut(value = "execution(* com.zzw.spring.demo1.OrderDao.save(..))")
    private void savePointcut(){}
    @Pointcut(value = "execution(* com.zzw.spring.demo1.OrderDao.delete(..))")
    private void deletePointcut(){}
    @Pointcut(value = "execution(* com.zzw.spring.demo1.OrderDao.update(..))")
    private void updatePointcut(){}
    @Pointcut(value = "execution(* com.zzw.spring.demo1.OrderDao.find(..))")
    private void findPointcut(){}

}
