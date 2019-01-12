package com.zzw.struts2Demo;

/**
 * Struts2 的入门Action类
 * */
public class HelloAction {

    /**
     * 提供一个方法:
     *      方法签名固定的,共有的
     * */
    public String execute(){

        System.out.println("helloAction被执行了");
        return null;
    }
}
