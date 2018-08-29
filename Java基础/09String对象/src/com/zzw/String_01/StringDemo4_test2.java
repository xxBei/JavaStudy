package com.zzw.String_01;

import java.util.Scanner;

public class StringDemo4_test2 {
    /**
     * 字符串反转
     * 举例: 键盘录入"abc"
     * 输出: "cba"
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符串:");
        String strArr = sc.nextLine();
        //String strr = Fan(strArr);
        String strrr = Fanzhuan(strArr);
        System.out.println(strrr);
    }
    /**
     * 方法一:
     * */
    /*public static String Fan(String strArr){
        String strs = "";

        for(int i=strArr.length()-1; i>=0; i--){
            strs += strArr.charAt(i);
        }

        return strs;
    }*/

    /**
     * 方法二:
     *      把字符串转化为字符数组,然后对字符数组进行反转,最后在把字符数组转化为字符串
     * */
    public static String Fanzhuan(String strArr){

        char[] str = strArr.toCharArray();

        for(int start=0,end=str.length-1;start<=end;start++,end--){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
        }
        //字符数组转化为字符串
        String strs = new String(str);
        return strs;
    }
}
