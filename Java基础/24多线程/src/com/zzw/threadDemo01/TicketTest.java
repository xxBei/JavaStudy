package com.zzw.threadDemo01;

public class TicketTest{
    public static void main(String[] args) {
        TicketThread tt = new TicketThread();

        Thread t1 = new Thread(tt);
        t1.setName("窗口1");

        Thread t2 = new Thread(tt);
        t2.setName("窗口2");

        Thread t3 = new Thread(tt);
        t3.setName("窗口3");

        //启动进程
        t1.start();
        t2.start();
        t3.start();
    }
}
