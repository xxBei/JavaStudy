package com.zzw.Interage;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入QQ号:");
        String qq = sc.nextLine();
        boolean b = check(qq);
        if(b == false){
            System.out.println("输入格式不符合要求");
        }
        else {
            System.out.println("输入正确");
        }
    }

    public static boolean check(String qq){
        int len = qq.length();
        //不能小于5或大于15
        if(len < 5 || len >15){
            return false;
        }
        //判断不能以0开头
        if(qq.startsWith("0")){
            return false;
        }

        //非数字
        for (int i=0; i<len; i++){
            char c = qq.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }
        return true;
    }
}
