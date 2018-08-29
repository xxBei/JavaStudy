package com.zzw.StringBuilder;

import java.util.Scanner;

public class StringBuilderTest03 {
    /**
    * 字符串反转
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符串");
        String str = sc.nextLine();

        //定义一个方法,进行反转
        String strs = reverseStr(str);
        System.out.println(strs);
    }
    public static String reverseStr(String string){
        String reverseStr = "";
        StringBuilder sb = new StringBuilder(string);
        reverseStr = sb.reverse().toString();

        return reverseStr;
    }
}
