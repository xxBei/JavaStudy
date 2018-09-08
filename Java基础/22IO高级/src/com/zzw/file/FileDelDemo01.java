package com.zzw.file;

import java.io.File;

/**
 * 删除指定的目录(包含子目录)
 * */
public class FileDelDemo01 {
    public static void main(String[] args) {
        File file = new File("delTest");
        method1(file);
    }

    public static void method1(File file){
        if(file.isDirectory()){//判断是否是目录
            File[] files = file.listFiles();//获取所有子文件和子目录
            for (File f : files){//循环出所有子文件和子目录
                if(f.isFile()){//判断是否是文件
                    System.out.println(f);
                    f.delete();//是文件直接删除
                }else if (f.isDirectory()){//判断是否是目录
                    method1(f);//是目录继续执行该方法,看目录里是否还有子文件
                }
            }
            file.delete();//删除自己
        }
    }
}
