package com.zzw.IODemo;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 需求: 往文件中写数据
 *      写数据--输出流--FileWriter
 *
 * FileWriter:
 *      FileWriter(String fileName):传递一个文件名称
 *
 * 输出流写数据流程:
 *      1.创键输出流对象
 *      2.调用输出流对象的写数据的方法
 *      3.释放资源
 *
 * */
public class IODemo01 {
    public static void main(String[] args) throws IOException {
        //创键输出流对象
        FileWriter fw = new FileWriter("a.txt");
        //调用写数据方法
        fw.write("IO流文字");
        //数据没有存储到文件,数据是写在缓冲区内存中
        //刷新缓冲区
        fw.flush();
        //释放资源
        fw.close();
    }
}
