package com.zzw.StringBuilder;

public class StringBuilderTest01 {
    /**
     * StringBuilder 和 String转换
     *      通过toString()方法可以将StringBuilder 转化为 String
     *      通过StringBuilder(String str) 构造方法,可以转化为String类型
     *
     * */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("zzw").append("hello");

        //转化为String类型
        String str = sb.toString();

        System.out.println(str);

        //将String 转化为 StringBuilder
        String str2 = "helloworld";
        StringBuilder sb2 = new StringBuilder(str2);
        sb2.append("--");
        System.out.println(sb2);
    }
}
