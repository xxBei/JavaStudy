package com.zzw.demo1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspectXML {

    /**
     * 前置通知
     * 可以用于获取方法名
     * */
    public void checkPri(JoinPoint joinPoint){
        System.out.println("权限校验=============="+joinPoint);
    }

    /**
     * 后置通知
     * 可以用于获取返回值
     * */
    public void whiteLog(Object log){
        System.out.println("日志输出=============="+log);
    }

    /**
     * 环绕通知
     * 用于检测性能
     * */
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前通知==============");
        Object obj = joinPoint.proceed();
        System.out.println("环绕后通知==============");
        return obj;
    }

    /**
     * 异常通知
     * */
    public void afterThrowing(Throwable throwable){
        System.out.println("异常通知抛出=============="+throwable.getMessage());
    }

    /**
     * 最终通知,无论有没有异常都会执行,相当于finally代码块里面的内容
     * */
    public void after(){
        System.out.println("最终通知=================");
    }

}
