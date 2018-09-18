package com.zzw.thread02;

public class MyThread implements Runnable{
    int num;

    public MyThread(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName() +":"+ i + ":" + num);
        }
    }
}
