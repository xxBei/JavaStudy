package com.zzw.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleInputStreamText {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Test.java");
//        FileOutputStream fos = new FileOutputStream("FilesCopy\\copy3.java");
        FileOutputStream fos = new FileOutputStream("FilesCopy\\copy4.java");

        //一次读写一个字节数组
        /*int len;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }*/

        //一次读取一个字节
        int b;
        while ((b = fis.read()) != -1){
            fos.write(b);
        }

        fis.close();
        fos.close();
    }
}
