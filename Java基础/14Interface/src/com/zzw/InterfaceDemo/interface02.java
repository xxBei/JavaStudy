package com.zzw.InterfaceDemo;

/**
 * 接口特点:
 *      1.只要接口A继承了接口B,那么只要和接口了接口A,就要去实现接口A和接口B的方法
 *      2.接口里面的成员变量都是常量,需要在开始的时候给它先初始化,最好使用final来修饰.
 * */

public class interface02 {
    public static void main(String[] args) {
        Test test = new Test();
        test.methodsA();
        test.methodsB();
        test.methodsC();
    }
}

interface interA{
    public final int age = 0;
    public abstract void methodsA();
}

interface interB extends interA{
    public abstract void methodsB();
}

interface interC extends interB{
    public abstract void methodsC();
}

class Test implements interC{

    @Override
    public void methodsA() {
        System.out.println("这是继承接口A里面的方法");
    }

    @Override
    public void methodsB() {
        System.out.println("这是继承接口B里面的方法");
    }

    @Override
    public void methodsC() {
        System.out.println("这是继承接口C里面的方法");
    }
}
