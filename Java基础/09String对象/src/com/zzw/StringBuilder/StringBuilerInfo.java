package com.zzw.StringBuilder;

public class StringBuilerInfo {
    /**
     * StringBuilder:是一个可变的字符串.也叫做字符串缓冲类.
     *
     * String和StringBuilder区别:
     *      String的内容是固定的.
     *      StringBuilder的内容是可变的.
     *
     * String在做拼接字符串的时候会都会构建一个新的String对象,既耗时,又浪费空间.
     *
     * 构造方法:
     *      StringBuilder(),默认容量16
     * 成员方法:
     *      public int capacity();返回当前容量
     *      public int length();返回长度（字符数）
     *
     *      容量:表示的理论值
     *      长度:表示的实际值
     * */
    public static void main(String[] args) {
        //创建对象:
        StringBuilder sb = new StringBuilder();
        //成员方法:
        System.out.println("sb:"+sb);
        System.out.println("当前容量:"+sb.capacity());
        System.out.println("当前长度:"+sb.length());
    }
}
