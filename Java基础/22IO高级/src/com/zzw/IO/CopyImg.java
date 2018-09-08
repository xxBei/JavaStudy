package com.zzw.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用字节流复制图像
 * */
public class CopyImg {
    public static void main(String[] args) throws IOException {
        //创键字节输入流对象
        FileInputStream fis = new FileInputStream("头像.jpg");
        //创键字节输出流对象
        FileOutputStream fos = new FileOutputStream("FilesCopy\\头像.jpg");

        //一次读取一个字符数组复制图片
        int len;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }

        //释放资源
        fis.close();
        fos.close();
    }
}
