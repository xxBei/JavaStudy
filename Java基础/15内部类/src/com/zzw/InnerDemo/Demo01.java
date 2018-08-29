package com.zzw.InnerDemo;

public class Demo01 {
    public static void main(String[] args) {
        //创键内部类
        OutClass.InnerClass inner = new OutClass().new InnerClass();
        inner.fection();

        //创键OutClass
        OutClass outClass = new OutClass();
        outClass.method();
    }
}


class OutClass{
    private int num = 20;

    public void method(){
        InnerClass i = new InnerClass();
        i.fection();
    }

    //创键一个内部类
    class InnerClass{
        public void fection(){
            System.out.println("function");
            System.out.println(num);
        }
    }
}