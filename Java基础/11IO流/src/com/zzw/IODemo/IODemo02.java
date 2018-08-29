package com.zzw.IODemo;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 如何数据换行实现
 * \n是换行,但是windows系统的文本文档没有换行,因为windows识别的是\r\n
 *
 * 如何追加数据
 * */
public class IODemo02 {
    public static void main(String[] args) throws IOException {
        //创键输出流对象
        FileWriter fw = new FileWriter("c.txt",true);//当为true时,可以在最后面追加,false反之

        //调用输出数据方法,\n表示换行
        for(int i=0; i<10; i++){
            fw.write("hello"+i+"\r\n");
        }
        fw.close();
    }
}
