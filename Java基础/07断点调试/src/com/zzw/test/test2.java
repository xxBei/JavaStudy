package com.zzw.test;

public class test2 {
    /*
    * 打印5位回文数：123321
    * 回文数：个位和万位相同，十位和千位相同
    * 求各个的位数
    * 个位：num%10
    * 十位：num/10%10
    * 千位：num/10/10/10%10
    * 万位:num/10/10/10/10%10
    * */
    public static void main(String[] args) {
        for(int i=10000; i<100000; i++){
            if(i%10 == i/10/10/10/10%10 && i/10%10 == i/10/10/10%10){
                System.out.println(i);
            }
        }
    }
}
