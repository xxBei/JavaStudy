package com.zzw.InterfaceDemo;

/**
 * 接口:
 *      接口语法:
 *          interface 接口{}
 *      接口特点:
 *          1.类和接口的关系:
 *                  实现关系,接口里面的方法都是抽象方法,没有非抽象方法
 *                  类只要进行接口,那么这个类必须实现这个接口里面所有的接口方法
 *          2.接口和接口的关系:
 *                  接口和接口之间是多接口,一个类可以接口多个接口
 * */
public class interface01 {
    public static void main(String[] args) {
        Car car = new Car();
        car.methods();
        car.function();
    }
}

interface InterfaceA{
    public abstract void methods();
}
interface InterfaceB{
    public abstract void function();
}
class Car implements InterfaceA,InterfaceB{

    @Override
    public void methods() {
        System.out.println("这是接口A里面的方法");
    }

    @Override
    public void function(){
        System.out.println("这是接口B里面的方法");
    }
}