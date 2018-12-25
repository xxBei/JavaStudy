package com.zzw.dongtaiDaili;

public final class GoogleCar1 implements ICar1 {


    @Override
    public String start(int a,int b) {
        System.out.println("汽车启动模式开启");
        return "start..."+a+"   "+b;
    }

    @Override
    public void run() {
        System.out.println("汽车运行模式开启");
    }

    @Override
    public void stop() {
        System.out.println("汽车停车模式开启");
    }

}
