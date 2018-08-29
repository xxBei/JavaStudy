package BufferedWorR;

import java.io.*;

public class teshu01 {
    /**
     * 缓冲流的特殊功能:
     * BufferedWrite
     *      void newLine();写一个换行符,这个换行符由系统决定
     * BufferedReader
     *      void ReadLine();一次读取一行内容,但是不会读取数据中的换行符
     * */
    public static void main(String[] args) throws IOException {
        /*BufferedWriter bw = new BufferedWriter(new FileWriter("bw2.txt"));
        for(int i=0;i<10;i++){
            bw.write("hello"+i);
            bw.newLine();
            bw.flush();
        }
        bw.close();*/

        BufferedReader br = new BufferedReader(new FileReader("b.txt"));
        //1.将读取的数据存到str
        //2.判读str里面是否有数据,没有数据会显示null
        //3.输出语句,注意,readLine()不会读取换行
        String str;
        while ((str=br.readLine()) != null){
            System.out.println(str);
        }
        br.close();
    }
}
