package com.zzw.file;

import java.io.File;

/**
 * 输出指定目录下所有的java文件名(包含子目录)
 * */
public class FileDemo01 {
    public static void main(String[] args) {
        File file = new File("src\\com\\zzw\\file");
        File file1 = new File("src");
//        method1(file);
        method2(file1);
    }

    public static void method2(File file){
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for (File f : files){
                if(f.isFile()){//判断是否是文件
                    if(f.getName().endsWith(".java")){
                        System.out.println(f.getName());
                    }
                }else if(f.isDirectory()){//判读是否是目录
                    method2(f);//使用递归在执行一遍该方法
                }
            }
        }
    }


    public static void method1(File file){
        if (file.isDirectory()){//判读是否是目录
            File[] files = file.listFiles();//获取所有目录和文件
            for(File f : files){//循环处所有文件和目录
                if(f.isFile()){//判断是否是文件
                    if(f.getName().endsWith(".java")){//获取名字然后判断结尾是否是.java
                        System.out.println(f.getName());
                    }
                }
            }
        }
    }
}
