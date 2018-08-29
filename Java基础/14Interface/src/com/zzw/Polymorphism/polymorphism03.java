package com.zzw.Polymorphism;

/**
 * 多态的向下转型和向上转型:
 *      向下转型:
 *          由父类强制转换为子类
 *      向上转型:
 *          由子类变成父类
 * */
public class polymorphism03 {
    public static void main(String[] args) {
        //这是向上转型,由子类变成父类
        Animal02 an = new Dog();
        an.eat();//吃骨头


        //向下转型,由父类强制转换为子类
        Dog d = (Dog) an;
        d.swim();
    }
}

class Animal02 {
    public void eat(){
        System.out.println("吃东西");
    }
}

class Dog extends Animal02{

    @Override
    public void eat(){
        System.out.println("吃骨头");
    }

    public void swim(){
        System.out.println("狗刨");
    }
}