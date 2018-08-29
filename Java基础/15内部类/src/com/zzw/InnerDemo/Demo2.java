package com.zzw.InnerDemo;

/**
 * 成员内部类的修饰符:
 *      我们可以使用权限修饰符修饰内部类,但是,如果用private来修饰内部类,则无法再其他类中使用
 *      我们也可以使用static修饰内部类,不用创建内部类的对象,就可以接访问
 *
 * */

public class Demo2 {
    public static void main(String[] args) {
//        如果用private来修饰内部类,则无法再其他类中使用
//        Inter i = new Inter();

//        不用创建内部类的对象,就可以接访问
        Outer.Inter.function();
    }
}


class Outer{
    public void method(){
        Inter i = new Inter();
        i.function();
    }
    static class Inter{
        public static void function(){
            System.out.println("function");
        }
    }
}