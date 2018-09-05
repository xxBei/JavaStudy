package com.zzw.file;

import java.io.File;
import java.io.IOException;

/**
 * File对象的常用方法:
 *   创键功能:
 *      boolean createNewFile()  当指定的文件不存在时,创键文件。成功返回true，失败返回false
 *      boolean mkdir()  创建目录。成功返回true，失败返回false
 *      boolean mkdirs()  创建目录，如果发现在该指定的目录上没有存在着其他的父目录，则将其他的父目录一块创建
 *   删除功能:
 *      boolean delete()  删除指定路径的文件或者是文件夹，注意，删除文件夹时，里面必须是空的
 * */
public class FileFunction {
    public static void main(String[] args) throws IOException {
        File file1 = new File("b.txt");//没有盘符表示相对路径
//        创建文件,成功返回true,失败false
//        System.out.println(file1.createNewFile());

        File file2 = new File("a");
//        创建文件夹,成功返回true,失败false
//        System.out.println(file2.mkdir());

        File file3 = new File("b\\c\\e");
//        创建文件夹,如果父文件夹不存在,则将其一起创建
//        System.out.println(file3.mkdirs());

//        删除指定的文件或者是指定的文件夹,成功返回true,失败返回false
        System.out.println(file1.delete());
        System.out.println(file2.delete());
        System.out.println(file3.delete());

    }
}
