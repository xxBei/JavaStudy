package com.zzw.args;

public class args1 {
    /*
    * 如果参数是普通数据类型：
    *     形式参数的改变不影响实际参数的。
    * */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a:"+a+"--"+"b:"+b);//a=10,b=20
        chang(a,b);
        System.out.println("a:"+a+"--"+"b:"+b);//a=10,b=20
    }
    public static void chang(int a,int b){
        System.out.println("a:"+a+"--"+"b:"+b);//a=10,b=20
        a = b;//a=20;
        b = a + b;//b=20+20=40
        System.out.println("a:"+a+"--"+"b:"+b);//a=20,b=40
    }
}
