package com.zzw.ArrayListTest;

import java.util.ArrayList;

public class ArrayListTest01 {
    /**
     * 需求:
     *      存储字符串并遍历
     * 分析:
     *      创键ArrayList对象
     *      添加字符串元素
     *      使用size和get方法遍历
     *
     * */
    public static void main(String[] args) {
        //创键对象
        ArrayList<String> arrayList = new ArrayList<>();

        //添加元素
        arrayList.add("曹操");
        arrayList.add("孙权");
        arrayList.add("刘备");

        //遍历集合
        for (int i=0; i<arrayList.size(); i++){
            String s = arrayList.get(i);
            System.out.println(s);
        }
    }
}
