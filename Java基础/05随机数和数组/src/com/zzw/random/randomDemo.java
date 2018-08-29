package com.zzw.random;
import java.util.Random;
import java.util.Scanner;

public class randomDemo {
    public static void main(String[] args) {
        /*
        * 猜数字游戏案例
        *   系统随机生成1-100之间的随机数字，猜出这个数字是多少
        *
        * */

        Random rd = new Random();
        int cai = rd.nextInt(100)+1;

        // 多次循环键盘录入，当满足条件时，break退出循环
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入猜测的数字：");
            int number = sc.nextInt();
                if (number > cai) {
                    System.out.println("猜大了！");
                } else if (number < cai) {
                    System.out.println("猜小了");
                } else if (number == cai) {
                    System.out.println("恭喜你，猜对了!");
                    break;
                }
        }
    }
}
