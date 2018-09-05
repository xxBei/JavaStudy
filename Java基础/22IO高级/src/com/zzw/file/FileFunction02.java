package com.zzw.file;

import java.io.File;

/**
 * File常用方法:
 *      判断功能:
 *          boolean exists(): 判断路径名表示的文件或目录是否存在。
 *          boolean isAbsolute(): 判断路径名是否是绝对的。
 *          boolean isDirectory(): 判断路径名表示的文件是否为目录。
 *          boolean isFile(): 判断路径名表示的文件是否为普通文件。
 *          boolean isHidden(): 判断路径名命名的文件是否为隐藏文件。
 * */
public class FileFunction02 {
    public static void main(String[] args) {
//        判断路径名表示的文件或目录是否存在
//        File file1 = new File("a.txt");
//        System.out.println(file1.exists());

//        判断路径名是否是绝对的
//        File file2 = new File("E:\\WeStudy\\Java\\Java基础\\22IO高级");
//        System.out.println(file2.isAbsolute());

//        判断路径名表示的文件是否为目录
//        File file3 = new File("b");
//        System.out.println(file3.isDirectory());

//        判断路径名表示的文件是否为普通文件
//        File file4 = new File("a.txt");
//        System.out.println(file4.isFile());

        File file5 = new File("b");
        System.out.println(file5.isHidden());
    }
}
