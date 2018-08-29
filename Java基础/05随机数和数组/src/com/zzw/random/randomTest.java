package com.zzw.random;

import java.util.Random;

public class randomTest {
    public static void main(String[] args) {
        /*
        * 获取0-9之间的随机数
        * */

        // 创建随机数对象
        Random rd = new Random();
        /*for(int i=0;i<=10;i++) {
            // 获取随机数
            int number = rd.nextInt(10);
            System.out.println("随机的数字有"+number);
        }*/

        /*
        * 获取1-100之间的随机数*/
        for(int i=1;i<=10;i++){
            int nums = rd.nextInt(10)+1;
            // System.out.println((int)(nums+1));
            System.out.println("随机数："+nums);
        }
    }
}
