package com.zzw.test;


import java.io.*;

/**
 * 需求:
 *      读取项目根目录的Test.java,并输出到命令行
 *
 *      数据源: 项目根目录下Files中的Test.java
 *      目的地: 命令行
 *
 *      标准输出流是一个字节输出流,所以只能输出字节或字节数组,但是我们读取的是字符串,所以要转换成字节数组
 *
 *
 * */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //method1();
        //创键高效输入流对象
        BufferedReader br = new BufferedReader(new FileReader("Files\\Test.java"));
        //创键输出流对象
        PrintStream osw = System.out;


    }

    public static void method1() throws IOException {
        //创键高效输入流对象
        BufferedReader br = new BufferedReader(new FileReader("Files\\Test.java"));
        //创键输出流对象
        OutputStream os = System.out;

        String line;
        //将读取的字符赋值给line
        while ((line = br.readLine()) != null){
            //注意,因为这是字节输出流,所以要讲字符转为字节
            os.write(line.getBytes());
            os.write("\r\n".getBytes());
        }

        //释放资源
        os.close();
        br.close();
    }
}
