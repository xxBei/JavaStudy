package com.zzw.String_01;

public class StringDemo3 {
    /**
     * 需求:
     *      String类的转换功能
     *      char[] tocharArray();把字符串转为字符数组
     *      String toLowerCase();将大写字符串转为小写
     *      String toUpperCase();将小写字符串转为大写
     * */
    public static void main(String[] args) {
        // 创建字符串
        String str = "Abcdefg";
        char[] chs = str.toCharArray();
        System.out.print("字符数组:");
        for(int i=0;i<chs.length;i++){
            System.out.print(chs[i]);
        }
        System.out.println();
        System.out.println("将大写字母变为小写:"+str.toLowerCase());
        System.out.println("将小写字母变为大写:"+str.toUpperCase());
    }
}
