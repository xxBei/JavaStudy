package com.zzw.Demo01;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 模拟斗地主发牌案例
 * */
public class Doudizhu {
    public static void main(String[] args) {
        String[] flower = {"黑桃","红心","方片","梅花"};
        String[] number = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        ArrayList<String> box = new ArrayList<>();
        for(int i=0; i<flower.length;i++){
            //遍历花色
            for(int j=0;j<number.length;j++){
                //遍历牌号
                box.add(flower[i] + number[j]);
            }
        }
        box.add("大王");
        box.add("小王");
        //System.out.println(box.size());

        Collections.shuffle(box);

        ArrayList<String> zf = new ArrayList<>();
        ArrayList<String> gy = new ArrayList<>();
        ArrayList<String> lb = new ArrayList<>();

        for(int i=0; i<box.size()-3; i++){
            /**
             * 0 % 3 = 0
             * 1 % 3 = 1
             * 2 % 3 = 2
             * 3 % 3 = 0
             * 4 % 3 = 1
             * 5 % 3 = 2
             * 根据规律可以分别将它们的余数对应的牌分别发放给3个人
             * */
            if(i % 3 == 0){
                zf.add(box.get(i));
            }else if(i % 3 == 1){
                gy.add(box.get(i));
            }else if(i % 3 == 2){
                lb.add(box.get(i));
            }
        }
        System.out.println(zf);
        System.out.println(gy);
        System.out.println(lb);
        System.out.println("底牌:");
        //露出底牌
        for(int i=box.size()-3; i<box.size();i++){
            System.out.println(box.get(i));
        }
    }
}
