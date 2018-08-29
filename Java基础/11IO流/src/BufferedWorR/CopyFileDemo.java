package BufferedWorR;

import java.io.*;

public class CopyFileDemo {
    /**
     * 使用特殊方法,复制文件内容到指定文件中
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("copy.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("copy4.java"));

        String str;
        while ((str=br.readLine())!=null){
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
