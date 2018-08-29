package com.zzw.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo3 {
    /**
     * ArrayList集合的遍历
     *      通过get和size方法实现
     * */
    public static void main(String[] args) {
        //创键对象
        ArrayList<String> arrayList = new ArrayList<String>();

        //添加元素
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");

        for(int i=0; i<arrayList.size(); i++){
            //获取元素
            String s = arrayList.get(i);
            System.out.println(s);
        }
    }
}
