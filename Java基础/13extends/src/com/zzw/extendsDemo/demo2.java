package com.zzw.extendsDemo;

/**
 * 继承中的构造方法执行顺序
 *      在有子父类关系中,创键子类对象,调用子类方法,
 *      如果子类构造方法第一行没有调用父类方法,则默认调用父类无参构造,
 *      只要创键子类对象,肯定会执行父类的构造,因为子类可能会用到父类,所以要先初始化
 * */

public class demo2 {
    public static void main(String[] args) {
//        Kil kil = new Kil(); 父类无参--子类无参
//        Die die = new Die(); 父类无参
//        Kil kil = new Kil(1); 父类无参--子类有参
        Kil kil = new Kil();//父类无参--子类有参--子类无参
    }
}

class Die{
    public Die(){
        System.out.println("我是父类无参构造方法");
    }
    public Die(int num){
        System.out.println("我是父类有参构造方法");
    }
}
class Kil extends Die{
    public Kil(){
//        super(1);//这是调用父类有参
        this(2);//调用本身子类有参
        System.out.println("我是子类无参构造方法");
    }
    public Kil(int num){
        System.out.println("我是子类有参构造方法");
    }
}