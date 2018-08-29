package com.zzw.duanjian;

import java.util.Scanner;

public class debugTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();
        int result = getSum(a,b);
        System.out.println("result:"+result);
    }
    /*
     * 求和方法debug流程
     */
    public static int getSum(int a,int b){
        int sum = a + b;
        return sum;
    }
}
