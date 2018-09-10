package com.zzw.test;

import java.io.*;

/*
* System.in 是标准的输入流
* System.out是标准的输出流
*
* 从控制台录入信息
* 数据源: 读取键盘录入的数据  System.in
* 目的地: Files目录下的文件  FileWriter
*
* 转换流:
*       由于InputStream是字节输入流,每次写入的时候都需要将数据转化为字符串,所以需要对字节输入流进行转换
*       将字节输入流转为字符输入流  InputStreamReader(InputStream in)
* */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        //method1();
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedWriter bw = new BufferedWriter(new FileWriter("Files\\b.txt"));

        char[] chs = new char[1024];
        int len;
        while ((len = r.read(chs)) != -1){
            bw.write(chs,0,len);
            bw.flush();
        }

        //释放资源
        bw.close();
        r.close();
    }

    public static void method1() throws IOException {
        //创键输入对象
        InputStream in = System.in;
        //创键输出流
        FileWriter fw = new FileWriter("Files\\a.txt");

        byte[] bytes = new byte[1024];
        int len;
        while ((len = in.read(bytes)) != -1){
            fw.write(new String(bytes,0,len));
            fw.flush();
        }

        //释放资源
        in.close();
        fw.close();
    }
}
