package com.zzw.demo1;

/**
 * 编写Action的方式一:
 *      自己动手写execute()方法
 * */
public class HelloAction {
    public String execute(){
        System.out.println("HelloAction被执行了...");
        return "success";
    }
}
