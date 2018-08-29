package com.zzw.myObject;

public class ComputerDemo {
    public static void main(String[] args) {
        //创建电脑类对象(实例化电脑对象)
        Computer computer = new Computer();

        //调用成员变量
        System.out.println("品牌:"+computer.brand);//null
        System.out.println("价格:"+computer.price);//0
        System.out.println("颜色:"+computer.color);//null
        System.out.println("---------------------");

        //修改成员变量
        computer.brand = "小米";
        computer.price = 6499;
        computer.color = "银灰色";
        System.out.println("品牌:"+computer.brand);//小米
        System.out.println("价格:"+computer.price);//6499
        System.out.println("颜色:"+computer.color);//银灰色
        System.out.println("---------------------");

        //调用成员方法
        computer.playGame("缺氧");
        computer.work();
        computer.seeVideo("相声有新人");
    }
}
