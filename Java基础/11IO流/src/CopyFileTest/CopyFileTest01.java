package CopyFileTest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileTest01 {
    /**
     *  需求:
     *      复制指定文件数据到copy2.java中
     *
     *  方法一:
     *      int read();返回获取的字符个数
     *
     *  方法二:
     *      char[] chs = new char[1024];
     *
     **/
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("IODemo02.java");
        FileWriter fw = new FileWriter("copy2.java");

        //int read();
        int ch;
        while((ch=fr.read()) !=-1){
            fw.write((char)ch);
        }

        fr.close();
        fw.close();
    }
}
