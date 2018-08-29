package com.zzw.String_01;

public class StringDemo2_test {
    /**
     * 需求:
     *      循环字符串(获取字符串中每一个元素)
     * */
    public static void main(String[] args) {
        String str = "abcdefg";
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
        }
    }
}
