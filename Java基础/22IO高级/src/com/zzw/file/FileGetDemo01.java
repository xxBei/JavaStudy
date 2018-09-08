package com.zzw.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *   获取功能:
 *      File getAbsoluteFile() :  获取绝对路径,但是返回的是对象
 *      String getAbsolutePath() : 获取绝对路径,但是返回的是字符串
 *      String getParent()  ： 获取父目录,返回的字符串
 *      File getParentFile() : 获取父目录,返回file对象
 *      String getName() :  获取的是文件名或文件夹名
 *      String getPath() ： 获取的是当前对象传入的路径,绝对路径就返回绝对,相对就返回相对
 *      long lastModified() : 以毫秒值返回最后修改时间
 *      long length()   :  返回文件字节数
 *   修改功能:
 *      boolean renameTo(File dest) : 将当前file所指向的路径  修改为  指定File所指向的路径,注意:
 *                                      修改的文件路径不能存在,如果存在则修改失败
 * */
public class FileGetDemo01 {
    public static void main(String[] args) throws IOException {
        //method1();
        //method2();
        //method3();
        //method4();
        //method5();
        File file = new File("a.txt");
        File file1 = new File("b.txt");
        System.out.println(file.renameTo(file1));

    }

    public static void method5() {
        File file = new File("a.txt");
        System.out.println(file.length());
    }

    public static void method4() {
        File file = new File("a.txt");
        File file1 = new File("E:\\a\\b.txt");
        File file2 = new File("c");

        System.out.println(file.lastModified());
        Date date = new Date(file.lastModified());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = simpleDateFormat.format(date.getTime());
        System.out.println(time);
    }

    public static void method3() {
        File file = new File("a.txt");
        File file1 = new File("E:\\a\\b.txt");
        File file2 = new File("c");

//        System.out.println(file.getName());
//        System.out.println(file1.getName());
//        System.out.println(file2.getName());

        System.out.println(file.getPath());
        System.out.println(file1.getPath());
        System.out.println(file2.getPath());
    }

    public static void method2() {
        File file = new File("a.txt");
        File file1 = new File("E:\\a\\","a.txt");
        System.out.println(file1.getParent());
        System.out.println(file1.getParentFile());
    }

    public static void method1() {
        File file = new File("E:\\a\\b\\b.txt");
        File file2 = new File("a.txt");
//        System.out.println(file.getAbsoluteFile());
//        System.out.println(file.getAbsoluteFile());
//        System.out.println(file2.getAbsoluteFile());
//        System.out.println(file2.getAbsolutePath());
    }
}
