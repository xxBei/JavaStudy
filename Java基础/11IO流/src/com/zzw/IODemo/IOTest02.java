package com.zzw.IODemo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest02 {
    /**
     * 需求:
     *      将文件内容复制到另一个文件中
     * */
    public static void main(String[] args) throws IOException {
        //创键输入流对象
        FileReader fr = new FileReader("src/com/zzw/IODemo/IODemo01.java");

        //创键输出流对象
        FileWriter fw = new FileWriter("copy.java");

        //循环读取数据
        int chs;
        while ((chs=fr.read()) != -1){
            //写入数据
            fw.write(chs);
        }

        //释放资源
        fr.close();
        fw.close();
    }
}
