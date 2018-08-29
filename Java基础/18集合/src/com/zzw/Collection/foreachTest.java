package com.zzw.Collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * foreach循环:
 *      用于循环集合和数组
 *
 * 格式:
 *      for(数据类型 name: 集合/数组名){
 *
 *      }
 * */
public class foreachTest {
    public static void main(String[] args) {
        //创键集合
        Collection<String> collection = new ArrayList<>();
        //添加元素
        collection.add("Hello");
        collection.add("World");
        collection.add("Java");

        //使用foreach遍历数组
        for (String s :collection ) {
            System.out.println(s);
        }
    }
}
