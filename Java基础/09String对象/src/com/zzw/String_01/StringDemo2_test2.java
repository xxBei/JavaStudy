package com.zzw.String_01;

import java.util.Scanner;

public class StringDemo2_test2 {
    /**
     * 需求:
     *      统计一个字符串中出现的大写字母个数,小写字母个数,数字个数
     * */
    public static void main(String[] args) {

        int bigCount = 0;
        int smallCount = 0;
        int numsCount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符串:");
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                bigCount += 1;
            }else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                smallCount += 1;
            }else if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                numsCount += 1;
            }else{
                System.out.println("该"+str.charAt(i)+"字符非法");
            }
        }
        System.out.println("大写字母:"+bigCount+",小写字母:"+smallCount+",数字:"+numsCount);
    }
}
