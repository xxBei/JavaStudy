package com.zzw.chouxiang;

/**
 * 抽象类特点:
 *      1.抽象方法只能在抽象类中
 *      2.抽象类和抽象方法必须被abstract修饰
 *      3.抽象类不能创键对象(不能实例化)
 *      4.抽象类和类的关系也是继承
 *      5.抽象类也可以有非抽象方法
 *      6.一个类继承了抽象类,要么重写所有抽象方法,要么自己也是抽象类
 * */
public class abstract02 {
    public static void main(String[] args) {
        //抽象类不能创键对象
        //    Animals animals = new Animals();
    }
}
//定义一个抽象类
abstract class Animals{
    //定义一个抽象方法
    abstract public void eat();
}

class Cats extends Animals{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
}