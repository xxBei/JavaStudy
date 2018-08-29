package com.zzw.chouxiang;

/**
 * 抽象类的概述:
 *
 *      关键字:abstract,它用于修饰类和方法
 *
 *      注意:
 *          1.抽象方法只能放在抽象类中
 *          2.一个类只要继承抽象类,那么,必须重写抽象类里面的方法
 *          3.一个类想要继承抽象,还不想重写抽象类的抽象方法,则本身必须成为抽象类
 *
 * */
public class abstract01 {

}

//定义一个抽象类
abstract class Animal{
    //定义一个抽象方法
    public abstract void eat();

    //不是抽象方法,可以不重写
    public void run(){

    }
}

//继承抽象类,必须要重写抽象类里面所有的抽象方法
class Cat extends Animal{
    //重写抽象方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

//继承抽象类,不想重写抽象方法,那就让其本身也成为抽象类
abstract class Dog extends Animal{

}