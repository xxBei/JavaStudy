package com.zzw.hanshu1;

import java.util.Scanner;
/*
* 键盘录入两个数据，返回两个数据的较大值
* */
public class hanshuScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();
        int max = qiuMax(a,b);
        System.out.println("较大值为："+max);
    }
    /*
    * 定义一个求最大值的函数
    * */
    public static int qiuMax(int a,int b){
        if(a > b){
            return a;
        }else{
            return b;
        }

    }
}
