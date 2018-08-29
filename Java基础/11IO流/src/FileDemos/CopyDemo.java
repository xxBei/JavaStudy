package FileDemos;

import java.io.*;

public class CopyDemo {
    /*
    * 复制文本数据到指定文件,5种方法
    * */
    public static void main(String[] args) throws IOException{
        String srcFileName = "txt/RainAlley.txt";
        String targetFileName = "txt/Copy.txt";

        //5种方法
        //method1(srcFileName,targetFileName);
        //method2(srcFileName,targetFileName);
        //method3(srcFileName,targetFileName);
        //method4(srcFileName,targetFileName);
        method5(srcFileName,targetFileName);
    }
    //基本流,一次读取一个字符
    public static void method1(String srcFileName,String targetFileName) throws IOException {
        FileWriter fw = new FileWriter(targetFileName);
        FileReader fr = new FileReader(srcFileName);
        int ch;
        while((ch=fr.read()) != -1){
            fw.write(ch);
        }
        fr.close();
        fw.close();
    }

    //基本流,一次读取一个字符数组
    public static void method2(String srcFileName,String targetFileName) throws IOException{
        FileReader fr = new FileReader(srcFileName);
        FileWriter fw = new FileWriter(targetFileName);

        char[] chs = new char[1024];
        int len;
        while ((len=fr.read(chs)) != -1){
            fw.write(chs,0,len);
        }
        fr.close();
        fw.flush();
        fw.close();
    }

    //高效缓冲流,一次读取一个字符
    public static void method3(String srcFileName,String targetFileName) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(srcFileName));
        BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileName));

        int ch;
        while ((ch=br.read())!=-1){
            bw.write(ch);
        }
        bw.flush();
        bw.close();
        br.close();

    }

    //一次读取一个字符数组
    public static void method4(String srcFileName,String targetFileName) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(srcFileName));
        BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileName));

        char[] chs = new char[1024];
        int len;

        while ((len=br.read(chs))!=-1){
            bw.write(chs,0,len);
        }

        bw.flush();
        bw.close();
        br.close();
    }

    //特殊功能
    public static void method5(String srcFileName,String targetFileName) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader(srcFileName));
        BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileName));

        String str;
        while ((str=br.readLine()) != null){
            bw.write(str);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
