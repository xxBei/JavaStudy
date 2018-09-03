package com.zzw.TryCatch;

import java.io.FileWriter;
import java.io.IOException;

/**
 * finally :
 *      组合try...catch使用,用于释放资源等首尾工作,无论try...catch怎么执行,finally的代码一定执行
 *
 *      try{
 *          有可能出现问题的代码
 *      }catch(异常对象){
 *          处理异常
 *      }finally{
 *          释放资源;
 *          清理垃圾;
 *      }
 * */
public class finallyDemo01 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            //System.out.println(2 / 0);
            fw = new FileWriter("test.txt");
            fw.write("hello");
            fw.write(" ");
            fw.write("world");
            fw.write(" ");
            fw.write("java");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fw != null){
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
