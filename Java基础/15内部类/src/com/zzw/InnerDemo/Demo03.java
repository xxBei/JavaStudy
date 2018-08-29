package com.zzw.InnerDemo;

/**
 * 局部内部类
 *      局部内部类,只能在方法中写,想要实例化局部内部类,必须将实例化,写在类的下面
 *
 * 注意:
 *      只要出了方法,则其他地方无法调用局部内部类
 *
 * */

public class Demo03 {
    public static void main(String[] args) {
        Out out = new Out();
        out.method();
    }
}


class Out{
    public void method(){
        class In{
            public void function(){
                System.out.println("fuction");
            }
        }
        In i = new In();
        i.function();
    }


}