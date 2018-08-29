package BufferedWorR;

import java.io.*;

public class BufferedStreamDemo01 {
    /**
     * BufferedWrite:将文本写入字符输出流，缓冲字符，以提供单个字符，数组和字符串的高效写入。
     * BufferedReader:从字符输入流读取文本，缓冲字符，以提供字符，数组和行的高效读取。
     * */
    public static void main(String[] args) throws IOException {
        /*
        //创键输出BufferedWrite对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));

        //调用方法写入数据
        bw.write("hello 缓冲字符输出流");
        //刷新缓冲区
        bw.flush();
        //释放资源
        bw.close();
        */

        //创键输入BufferedReader对象
        BufferedReader br = new BufferedReader(new FileReader("copy3.java"));
        /**
         * 读取数据:
         *      方法一:
         *          int read();一次读取一个字符
         *      方法二:
         *          char[] ch = new char[1024];一次读取一组字符数组
         * */

        /*方法一*/
        /*int ch;
        while((ch=br.read()) !=-1){
            System.out.print((char)ch);
        }*/

        /*方法二:*/
        //定义字符数组
        char[] chs = new char[1024];
        int len;
        while ((len=br.read(chs)) !=-1){
            System.out.print(new String(chs,0,len));
        }
        br.close();
    }
}
