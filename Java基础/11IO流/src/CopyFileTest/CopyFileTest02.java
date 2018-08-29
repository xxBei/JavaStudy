package CopyFileTest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileTest02 {
    /**
     *  需求:
     *      复制指定文件数据到copy3.java中
     *
     *  方法一:
     *      int read();一次获取一个字符;返回获取的字符个数;
     *
     *  方法二:
     *      char[] chs = new char[4];一次获取一个字符数组;返回获取的字符个数;
     *
     **/
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("copy.java");
        FileWriter fw = new FileWriter("copy3.java");

        //定义字符数组
        char[] chs = new char[1024];
        //获取得到字符的个数
        int len;
        //循环获取的字符,如果len=-1则表示获取到了结尾,停止获取
        while((len=fr.read(chs)) !=-1){
            //从索引0开始截取到获取的个数位置停止
            fw.write(chs,0,len);
        }
        //释放资源
        fr.close();
        fw.close();

    }
}
