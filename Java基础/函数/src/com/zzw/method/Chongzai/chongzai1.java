package com.zzw.method.Chongzai;

public class chongzai1 {
    public static void main(String[] args) {
        /*
        * 方法重载：
        *   允许方法名一致，参数列表必须不一致
        *   参数列表：
        *       个数不同
        *       数据类型不同
        * */
        int result = getSum(50,30);
        int sum = getSum(10,20,30);
        System.out.println("result:"+result);
        System.out.println("sum:"+sum);
    }
    //求和
    public static int getSum(int a,int b){
        return a + b;
    }
    public  static int getSum(int a,int b,int c){
        return a + b + c;
    }
}

