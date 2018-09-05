package com.zzw.file;

import java.io.File;

/**
 * File构造函数
 * File(URL url)
 * File(String parent)
 * File(String parent,String child)
 * File(File parent, String child)
 *
 * */
public class FileGouZao {
    public static void main(String[] args) {
        //使用file对象指向文件路径
//        File file_1 = new File("E:\\WeStudy\\Java\\Java基础\\22IO高级\\a.txt");
        //通过实例化父路径名字符串,然后在使用File(String parent,String child)指向子文件路径
//        File file_2 = new File("E:\\WeStudy\\Java\\Java基础\\22IO高级");
//        File file_3 = new File(file_2,"a.txt");
        File file_4 = new File(new File("E:\\WeStudy\\Java\\Java基础\\22IO高级"),"a.txt");
    }
}