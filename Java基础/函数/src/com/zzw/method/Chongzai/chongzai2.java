package com.zzw.method.Chongzai;

public class chongzai2 {
    /*
    * 比较两个数是否相等。参数分别为byte,short,int,long
    * */
    public static void main(String[] args) {
        System.out.println(compare(10,20));
        System.out.println(compare((byte)10,(byte)20));
        System.out.println(compare((short)10,(short) 20));
        System.out.println(compare((long)10,(long)20));
    }
    public static boolean compare(byte a,byte b){
        System.out.println("byte");
        return a == b;
    }
    public static boolean compare(short a,short b){
        System.out.println("short");
        return a == b;
    }
    public static boolean compare(int a,int b){
        System.out.println("int");
        return a == b;
    }
    public static boolean compare(long a,long b){
        System.out.println("long");
        return a == b;
    }

}
