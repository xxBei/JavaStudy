package com.zzw.String_01;

import java.util.Scanner;

public class StringDemo3_test1 {
    /**
    *  需求:
     *      键盘录入一段字符串,将首字母改为大写,其余小写
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符串:");
        String str = sc.nextLine();

        String s1 = str.substring(0,1);
        String s2 = str.substring(1);
        String s3 = s1.toUpperCase() + s2.toLowerCase();
        System.out.println(s3);

    }
}
