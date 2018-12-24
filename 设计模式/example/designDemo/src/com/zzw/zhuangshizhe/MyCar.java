package com.zzw.zhuangshizhe;

public class MyCar implements ICar{
    ICar car;

    public MyCar(ICar car){
        this.car = car;
    }

    @Override
    public void start() {
        System.out.println("检查天气状况是否良好");
        System.out.println("检查路况状况是否良好");
        car.start();
    }

    @Override
    public void run() {
        car.run();
    }

    @Override
    public void stop() {
        car.stop();
    }
}
