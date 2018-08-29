package com.zzw.String_01;

public class StringDemo2 {
    /**
     * String类的获取功能
     * int length();获取字符串的长度
     * char charAt(int index);获取指定索引的字符
     * int indexOf(String str);获取str在对象中第一次出现的位置,查不到元素将返回-1
     * String substring(int start);从start开始截取字符串
     * String substring(int start,int end);从start开始截取字符串到end结束
     *
     * */

    public static void main(String[] args) {

        String str1 = "1a3abc";

        System.out.println(str1.length());
        System.out.println("---------------");

        System.out.println("当前索引对应元素为:"+str1.charAt(str1.length()-1));
        System.out.println("---------------");

        System.out.println("获取a3第一次出现的索引:"+str1.indexOf("a3"));
        System.out.println("获取a3第一次出现的索引:"+str1.indexOf("123"));//没有123,返回-1
        System.out.println("---------------");

        System.out.println(str1.substring(1));
        System.out.println("---------------");
        System.out.println(str1.substring(1,5));
    }
}
