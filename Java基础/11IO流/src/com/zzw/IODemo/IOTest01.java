package com.zzw.IODemo;

import java.io.FileWriter;
import java.io.IOException;

public class IOTest01 {
    /**
     * void write(String str); 写一个字符串数据
     * void write(String str,int len); 写一个字符串中的一部分数据
     * void write(int ch); 写一个字符数据,这里写int类型的好处是既可以写char类型,也可以写char对应的int类型的值
     * void write(char[] chs); 写一个字符数组
     * void write(char[] chs,int index,int len); 写一个字符数组的一部分数据
     * */
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("b.txt");

        //写入数据
        //void write(String str); 写一个字符串数据
        //fw.write("hello IO流");

        //void write(String str,int len); 写一个字符串中的一部分数据
        //fw.write("abcdef",1,3);

        //void write(int ch);
        //fw.write('a');
        //fw.write(97);

        //void write(char[] chs);
        //char[] chs = {'a','b','c','d'};
        //fw.write(chs);

        //void write(char[] chs,int index,int len);
        char[] chs = {'a','b','c','d','e','f'};
        fw.write(chs,1,3);

        //close()会先刷新缓冲区然后在释放资源
        fw.close();

    }
}
