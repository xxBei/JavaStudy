package ArrayBuffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayBufferedDemo02 {
    /**
     * 需求:
     *      读取文件,将读取的数据放到ArrayList集合中,并遍历集合
     *      每一行数据为一个字符串元素
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("b.txt"));
        ArrayList<String> arrayList = new ArrayList<>();

        String str;
        while ((str=br.readLine()) != null){
            arrayList.add(str);
        }
        //释放资源
        br.close();
        for(int i=0;i<arrayList.size();i++){
            String s = arrayList.get(i);
            System.out.println(s);
        }


    }
}
