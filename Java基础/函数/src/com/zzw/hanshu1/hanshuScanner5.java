package com.zzw.hanshu1;

import java.util.Scanner;

public class hanshuScanner5 {
    /*
    * 写一个方法，传递一个大于1的整数，在控制台从1打印到该数
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请填写任意一个整数");
        int number = sc.nextInt();
        zhengshu(number);
    }
    public static void zhengshu(int x){
        for(int i=1;i<=x;i++){
            System.out.println(i);
        }
    }
}
