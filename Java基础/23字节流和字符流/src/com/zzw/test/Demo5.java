package com.zzw.test;

import java.io.*;

/**
 * 使用打印流复制文件
 * */
public class Demo5 {
    public static void main(String[] args) throws IOException {
        //高效读写流
        BufferedReader br = new BufferedReader(new FileReader("src\\com\\zzw\\test\\Demo1.java"));
        //创键打印流
        PrintWriter pw = new PrintWriter(new FileWriter("Files\\f.java"),true);

        //写入数据
        String line;
       while ((line = br.readLine()) != null){
           pw.println(line);
       }


        //释放资源
        pw.close();
        br.close();
    }
}
