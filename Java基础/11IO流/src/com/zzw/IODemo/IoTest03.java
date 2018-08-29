package com.zzw.IODemo;

import java.io.FileReader;
import java.io.IOException;

public class IoTest03 {
    /**
     * 读数据,一次一个字符数组
     * */
    public static void main(String[] args) throws IOException {
        //创键输出流对象
        FileReader fr = new FileReader("src/com/zzw/IODemo/IODemo01.java");
        //FileReader fr = new FileReader("b.txt");

        //调用读输入流对象的读取方法
        //int read(char[] chs):一次读一个字符数组的数据
        /*char[] chs = new char[5];

        int len = fr.read(chs);//len是返回的字符个数
        System.out.println(len);
        System.out.println(new String(chs,0,len));

        len = fr.read(chs);//len是返回的字符个数
        System.out.println(len);
        System.out.println(new String(chs,0,len));

        len = fr.read(chs);//len是返回的字符个数
        System.out.println(len);
        System.out.println(new String(chs,0,len));

        len = fr.read(chs);//len是返回的字符个数
        System.out.println(len);
        System.out.println(new String(chs,0,len));*/

        //标准写法
        char[] chs = new char[1024];//这里可以是1024及其整数倍
        int len;
        while ((len=fr.read(chs)) != -1){
            //将char转化为String,并从索引0开始到获取到的字符个数位置截取字符串
            System.out.print(new String(chs,0,len));
        }


        fr.close();

    }
}
