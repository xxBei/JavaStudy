package com.zzw;

public class zhengze {
    /**
     * 正则表达式
     *      boolean matches(String regex);
     *      告诉这个字符串是否匹配正则表达式
     * */
    public static void main(String[] args) {
        String str = "1234a";
        //正则表达式: 不能以0开头,必须是数字,长度为5-15之间
        boolean flag = str.matches("[1-9][0-9]{4,14}");
        System.out.println(flag);
    }
}
