package com.zzw.danli;


/**
 * Danli的静态属性danli中,只有danli等于null时才创键一个实例
 *构造函数私有,确保只每次只能创键一个,避免重复创键
 *
 * 缺点:
 *      只在单线程的情况下正常运行，在多线程的情况下，就会出问题。
 *      例如：当两个线程同时运行到判断danli是否为空的if语句，
 *      并且instance确实没有创建好时，那么两个线程都会创建一个实例。
 *
 * */

public class Danli {
    private static Danli danli = null;

    private Danli() {}

    public static Danli getInstance() {
        if(danli == null){
            danli = new Danli();
        }
        return danli;
    }
}
