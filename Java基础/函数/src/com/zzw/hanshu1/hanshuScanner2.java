package com.zzw.hanshu1;

import java.util.Scanner;

public class hanshuScanner2 {
    /*
    * 键盘录入两个数据，判读两个数据是否相等
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();
        boolean compare = getcompare(a,b);
        if(compare == true){
            System.out.println("两个数据相等");
        }else{
            System.out.println("两个数据不相等");
        }
    }
    /*
    * 定义一个判读两个数是否相等的函数
    * */
    public static boolean getcompare(int a,int b){
        if (a == b){
            return true;
        }else{
            return false;
        }
    }
}
