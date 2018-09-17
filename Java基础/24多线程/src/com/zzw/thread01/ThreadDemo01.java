package com.zzw.thread01;

/**
 * 多线程实现方法:
 *      方法一:
 *          将类声明为Thread的子类,该类重写Thread的run方法.
 * Thread:
 *      String getName()    返回该线程的名称
 *      void setName(String name)   改变线程名称
 * CPU执行程序是随机的
 * */
public class ThreadDemo01 {
    public static void main(String[] args) {
        //创建线程实例
        MyThread mt = new MyThread();
        //修改线程名字
        mt.setName("第一个线程");
        //启动线程
        mt.start();

        MyThread mt2 = new MyThread();
        mt2.setName("第二个线程");
        mt2.start();
    }
}
