package com.zzw.test;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * 打印流分为两种:
 *      PrintStream  :  字符打印流
 *      PrintWriter  :  字节打印流
 *          PrintWriter特点:
 *             可以自动换行,println()
 *             能输出字节,但是能输出任意类型
 *             通过某些配置,可以实现自动刷新(只有调用println、printf或format才能用)
 *             可以把字节输出流转为字符输出流
 *
 *      打印流只能输出,不能输入
 * */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        //创键打印流的对象
        PrintWriter pw = new PrintWriter("Files\\c.txt");

        //写出数据
        pw.write("hello");
        pw.write("world");
        pw.write("java");

        //释放资源
        pw.close();
    }
}
