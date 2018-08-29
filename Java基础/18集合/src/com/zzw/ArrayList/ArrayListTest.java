package com.zzw.ArrayList;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //创键集合对象
        ArrayList arrayList = new ArrayList();
        //添加元素
        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("Java");
        //遍历集合
        for(int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
