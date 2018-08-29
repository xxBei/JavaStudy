package com.zzw.String_01;

public class StringDemo4 {
    /**
     * 去除字符串两段空格
     *      String trim();
     *  按照指定符号分割字符串
     *      String[] split(String str);
     * */
    public static void main(String[] args) {
        String str1 = "helloworld";
        String str2 = "   helloworld   ";
        String str3 = "   hello  world   ";
        System.out.println("---"+str1+"---");
        System.out.println("---"+str1.trim()+"---");
        System.out.println("---"+str2+"---");
        System.out.println("---"+str2.trim()+"---");
        System.out.println("---"+str3+"---");
        System.out.println("---"+str3.trim()+"---");

        String str4 = "aa,bb,cc,dd,ee,ff";
        String[] strs = str4.split(",");
        for(int i=0; i<strs.length; i++){
            System.out.print(strs[i]);
        }
    }
}
