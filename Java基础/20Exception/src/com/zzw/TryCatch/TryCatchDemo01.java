package com.zzw.TryCatch;

public class TryCatchDemo01 {
    public static void main(String[] args) {
        //method1();
        //method2();

    }

    public static void method2() {
        try {
            String str = null;
            System.out.println(str.length());

            System.out.println(2 / 0);
        }catch (NullPointerException e){
            System.out.println("这是个空指针");
        }catch (ArithmeticException e) {
            //显示错误类型
            //System.out.println(e.toString());
            //显示错误的原因
            //System.out.println(e.getMessage());
            //显示错误的类型,原因和方法
            e.printStackTrace();
        }
    }

    public static void method1() {
        try {
            //数学错误:ArithmeticException,被除数不能为0
            System.out.println(2 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}
