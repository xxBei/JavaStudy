package com.zzw.thread02;

/**
 * 创建多线程实现方法2:
 *      创建线程的另一种方法是声明实现 Runnable 接口的类。该类然后实现run方法。然后可以分配类的实例，在创建Thread时作为一个参数传入进去。
 *
 *      Thread(Runnable target)
 *      static Thread currentThread() : 返回当前线程对象
 *
 *
 * */

public class ThreadDemo01 {
    public static void main(String[] args) {
//        method();
        MyThread mt = new MyThread(3);
        Thread t = new Thread(mt);
        t.setName("No.3");
        t.start();

        Thread t2 = new Thread(mt);
        t2.setName("No.4");
        t2.start();
    }

    private static void method() {
        MyThread mt = new MyThread(1);
        Thread t = new Thread(mt);
        t.setName("No.1");
        t.start();

        MyThread mt2 = new MyThread(2);
        Thread t2 = new Thread(mt2);
        t2.setName("No.2");
        t2.start();
    }
}
