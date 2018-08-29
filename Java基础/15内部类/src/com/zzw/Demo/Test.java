package com.zzw.Demo;

public class Test {
    public static void main(String[] args) {
        /*这是传统模式*/
//        method(new Cat());
//        method(new Dog());

        /*这是使用匿名内部类的调用方式
        *
        * 一般只有在这个类作为参数传递时,并且只会传一次的时候,可以使用匿名内部类
        *
        * */
        method(
            new Dog(){
                @Override
                public void eat(){
                    System.out.println("狗吃骨头");
                }
            }
        );
    }

    public static void method(Animal animal){
        animal.eat();
    }
}
