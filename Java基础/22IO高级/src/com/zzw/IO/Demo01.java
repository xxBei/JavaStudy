package com.zzw.IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 使用字符流复制文本
 * */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        method();
    }
    public static void method() throws IOException {
        FileReader fr = new FileReader("Test.java");
//        FileWriter fw = new FileWriter("E:\\WeStudy\\Java\\Java基础\\22IO高级\\FilesCopy\\Copy1.java");
        FileWriter fw = new FileWriter("E:\\WeStudy\\Java\\Java基础\\22IO高级\\FilesCopy\\Copy2.java");

        //使用一次读写一个字符复制文本
//        int ch;
//        while ((ch = fr.read()) != -1){
//            fw.write(ch);
//            fw.flush();
//        }

        //使用一次读取一个字符数组复制文本
        int len;
        char[] chs = new char[1024];
        while ((len = fr.read(chs)) != -1){
            fw.write(chs,0,len);
            fw.flush();
        }

        fw.close();
        fr.close();
    }
}
