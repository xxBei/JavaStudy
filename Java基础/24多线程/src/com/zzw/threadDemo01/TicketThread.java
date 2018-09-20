package com.zzw.threadDemo01;

/**
 * 当多个线程同时使用一个资源时,容易出现一些未知错误,所以我们需要一个锁将共同使用的资源给进行锁定
 * 当一个线程正在使用时,不让其他线程使用,当使用完后才能让其他人使用.
 *
 * 共用方法解决方案:
 *      同步 : synchronized
 *      可以修饰代码块和方法,被修饰的代码块和方法一旦被某个线程访问,怎直接锁住,其他线程无法访问.
 *
 *      同步代码块:
 *          synchronized(锁对象){
 *
 *          }
 *
 * 同步: 安全性高,但是效率低(涉及到开锁和关锁)
 * 非同步: 安全性低,效率高
 * */
public class TicketThread implements Runnable{
    int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {
        while (true){
            synchronized (obj) {
                if (ticket > 0) {
                    try {
                        //调用线程里面的sleep方法,该方法是休眠,里面的参数毫秒
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + ticket--);
                }
            }
        }
    }
}
