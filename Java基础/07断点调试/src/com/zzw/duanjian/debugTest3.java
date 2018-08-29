package com.zzw.duanjian;

import java.util.Scanner;

public class debugTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数值：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数值：");
        int b = sc.nextInt();
        getSum(a,b);
    }
    public static void getSum(int a,int b){
        int sum = a + b;
        System.out.println("sum:"+sum);
    }
}
