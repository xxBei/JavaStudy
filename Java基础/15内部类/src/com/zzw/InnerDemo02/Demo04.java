package com.zzw.InnerDemo02;

/**
 * 匿名内部类
 *      可以把匿名内部类看成是一个没有名字的局部内部类
 *      定义在方法中
 *      必须在定义匿名内部类的时候创键他的对象
 *
 * 格式:
 *      new 类/接口(){
 *
 *         如果是创键了继承这个类的子类对象,我们可以重写父类方法
 *         如果是创键了实现这和接口的子类对象,我们可以重写接口的所有方法
 *
 *      };
 * */
public class Demo04 {
    public static void main(String[] args) {
        /*Outer on = new Outer();
        on.method();*/

        Out o = new Out();
        o.methods();
    }
}

interface Demo{
    public void functions();
}

class Out{
    public void methods(){

        Demo d = new Demo() {
            @Override
            public void functions() {
                System.out.println("functions");
            }
        };
        d.functions();
        d.functions();
    }
}

/*class Test{
    public void function(){
        System.out.println("function");
    }
}*/

/*
class Outer{

    public void method(){
        //这种匿名内部类只能调用一次方法
        */
/*new Test(){
            @Override
            public void function(){
                System.out.println("function");
            }
        }.function();*//*


        //通过下面的方法,将匿名内部类存在父类型的中,可以调用多次
        Test test = new Test(){
            @Override
            public void function(){
                System.out.println("function1");
            }
        };
        test.function();
        test.function();
    }
}*/
