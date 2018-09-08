package com.zzw.file;

import java.io.File;

/**
 * 重要的获取功能:
 *      String[] list() :  返回当前路径下所有的文件和文件夹名称,只有file对象指向的是文件夹,才能调用
 *      File[] listFiles()  :  返回的是根据file对象所指定的路径进行返回,如果是绝对路径,那么获取的都是绝对路径+文件名和文件夹名,相对则反之
 *      static File[] listRoots()  :  返回的是所有盘符
 * */
public class FIleGetDemo02 {
    public static void main(String[] args) {

        //method1();
        //method2();
        File[] file = File.listRoots();
        for (File files : file){
            System.out.println(files);
        }
    }

    public static void method2() {
        File file = new File("src");
        File file1 = new File("E:\\WeStudy\\Java\\Java基础\\22IO高级");

        File[] files = file1.listFiles();
        for (int i=0; i<files.length; i++){
            System.out.println(files[i]);
        }
    }

    public static void method1() {
        File file = new File("E:\\WeStudy\\Java\\Java基础\\22IO高级");

        //String[] list()
        String[] files = file.list();
        for(var i=0; i<files.length; i++){
            System.out.println(files[i]);
        }
    }
}
