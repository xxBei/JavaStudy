package com.zzw.test;

import java.io.*;
import java.util.Properties;

/**
 * Properties和IO流结合的功能
 *      添加数据,参数只能使用打印流
 *          void list(PrintStream out)
 *      添加数据,参数可以是任意输出流,最后一个参数是备注
 *          void store(Writer writer, String comments)
 *      读取数据
 *          void load(Reader reader)
 * */
public class PropertiesTest02 {
    public static void main(String[] args) throws IOException {
//        method1();
//        method2();
//        method3();
//        method4();
    }

    public static void method4() throws IOException {
        Properties pro = new Properties();
        BufferedReader br = new BufferedReader(new FileReader("Files\\prop.txt"));
        pro.load(br);
        br.close();
        System.out.println(pro);
    }

    public static void method3() throws IOException {
        //创键属性列表
        Properties pro = new Properties();
        //添加映射关系
        pro.put("001","张三");
        pro.put("002","李四");
        pro.put("003","王五");
        //创键输出流对象
        FileWriter fw = new FileWriter("Files\\prop.txt");
        pro.store(fw,"hello");

        //释放资源
        fw.close();
    }

    public static void method2() throws IOException {
        //创键属性列表
        Properties pro = new Properties();

        //创键输入流对象
        FileReader fr = new FileReader("Files\\pro.txt");
        //读取数据
        pro.load(fr);

        //释放资源
        fr.close();

        System.out.println(pro);
    }

    public static void method1() throws IOException {
        //创键属性列表
        Properties pro = new Properties();
        //添加映射关系
        pro.put("001","张三");
        pro.put("002","李四");
        pro.put("003","王五");

        //创键打印流对象
        PrintStream ps = new PrintStream("Files\\pro.txt");
        //void list(PrintStream out)
        pro.list(ps);
        //释放资源
        ps.close();
    }
}
