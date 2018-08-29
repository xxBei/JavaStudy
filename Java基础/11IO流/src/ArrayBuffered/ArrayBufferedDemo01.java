package ArrayBuffered;

import java.io.*;
import java.util.ArrayList;

public class ArrayBufferedDemo01 {
    /**
     * 需求:
     *      将集合中的数据添加到文件中
     * */
    public static void main(String[] args) throws IOException {
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");

        BufferedWriter bw = new BufferedWriter(new FileWriter("txt/arrTxt.txt"));
        for(int i=0; i<array.size(); i++) {
            //获取集合里面的所有数据
            String s = array.get(i);
//          写入数据
            bw.write(s);
//          添加换行
            bw.newLine();
//          刷新缓冲区
            bw.flush();
        }
        bw.close();

    }
}
