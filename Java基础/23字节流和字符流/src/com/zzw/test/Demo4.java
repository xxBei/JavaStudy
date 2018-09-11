package com.zzw.test;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *    PrintWriter  :  字节打印流
 *        PrintWriter特点:
 *           自动换行 println()
 *           自动刷新 : 想要使用自动刷新,在创键PrintWriter对象时,开启自动刷新开关,并且使用println等3个方法实现自动刷新
 *
 *
 *
 * */
public class Demo4 {
    public static void main(String[] args) throws IOException {
        //创键打印流的对象,后面的true表示自动刷新开关已启动
        PrintWriter pw = new PrintWriter(new FileWriter("Files\\e.txt"),true);


        //写入数据
        pw.println("这是");
        pw.println("自动");
        pw.println("刷新");

        //释放资源
        //pw.close();
    }

    //自动换行
    public static void method1() throws FileNotFoundException {
        //创键打印流的对象
        PrintWriter pw = new PrintWriter("Files\\d.txt");

        //写入数据
        pw.println("这是");
        pw.println("自动");
        pw.println("换行");

        //释放资源
        pw.close();
    }
}
