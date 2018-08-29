package com.zzw.IODemo;

import java.io.FileReader;
import java.io.IOException;

public class IODemo03 {
    /**
     * IO流读取数据:
     *
     *      读数据--输入流--FileReader
     *
     *      FileReader:
     *          FileReader(String FileName);
     *
     *      //当文件读取到最后的时候会返回-1,可以通过-1来判断是否到了文章的最后
     *  */
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src/com/zzw/IODemo/IODemo01.java");

        //循环读取数据
        int chs;
        while ((chs=fr.read()) != -1){
            System.out.print((char) chs);
        }
        //释放资源
        fr.close();
    }
}
