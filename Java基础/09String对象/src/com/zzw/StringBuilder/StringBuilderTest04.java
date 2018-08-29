package com.zzw.StringBuilder;

import java.util.Scanner;

public class StringBuilderTest04 {
    /**
     * 判断一个字符串是否是对称字符串
     * 例如:
     *      "aba","muuauum"是对称字符串
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符串:");
        String str = sc.nextLine();

        //定义一个方法来进行判断是否是对称字符串
        judgment(str);
    }
    public static void judgment(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String result = sb.toString();

        System.out.println(str+"----"+result);
        boolean b = false;
        b = str.equals(result);
        if(b == true){
            System.out.println("对称字符串");
        }else{
            System.out.println("非对称字符串");
        }
    }
}
