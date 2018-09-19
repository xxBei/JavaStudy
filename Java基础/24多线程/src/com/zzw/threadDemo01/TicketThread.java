package com.zzw.threadDemo01;

public class TicketThread implements Runnable{
    int ticket = 100;
    @Override
    public void run() {
        while (true){
            if (ticket > 0){
                System.out.println(Thread.currentThread().getName() + ":" + ticket--);
            }
        }
    }
}
