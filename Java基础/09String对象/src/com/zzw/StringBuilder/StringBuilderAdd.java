package com.zzw.StringBuilder;

public class StringBuilderAdd {
    /**
     * 添加功能:
     *      public StringBuilder append(Object obj)
     * 反转功能:
     *      public StringBuilder reverse()
     *      可以让字符序列被序列的相反代替
     * */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append(" ");
        sb.append("world");
        System.out.println(sb);
        StringBuilder sb2 = new StringBuilder();
        //链式编程
        sb2.append(1234).append(" ").append(1234).append(",向之歌");
        System.out.println(sb2);

        //反转功能
        sb.reverse();
        System.out.println("sb:"+sb);
    }
}
