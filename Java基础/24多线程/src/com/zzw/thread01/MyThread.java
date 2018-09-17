package com.zzw.thread01;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (var i=0;i<20; i++){
            System.out.println(getName() + ":" + i);
        }
    }
}
