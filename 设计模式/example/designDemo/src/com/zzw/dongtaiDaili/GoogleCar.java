package com.zzw.dongtaiDaili;

public final class GoogleCar implements ICar {


    @Override
    public void start() {
        System.out.println("汽车启动模式开启");
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
