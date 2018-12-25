package com.zzw.zhuangshizhe;

public class TestCar{


    /**
     * 装饰者模式:
     *      使用场景:二次开发的时候,无法获取源码,无法继承的前提下,要对已经存在的对象上的功能进行增强
     *
     * 弊端:
     *      接口的方法有很多,接口的时候就必须实现接口里面的方法,这样会让没用的代码也会加载进来代码会冗余
     * */
    public static void main(String[] args) {
        MyCar car = new MyCar(new GoogleCar());

        car.start();
        car.run();
        car.stop();
    }
}
