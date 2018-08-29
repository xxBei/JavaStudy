package com.zzw.Polymorphism;

/**
 * 多态的前提:
 *      子父类的继承关系
 *      方法的重写
 *      父类引用子类对象
 * */
public class Polymorphism01 {
    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.eat();

//        父类引用子类对象
        Animal a = new Cat();
        a.eat();
    }
}

class Animal{
    public void eat(){
        System.out.println("吃东西");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
