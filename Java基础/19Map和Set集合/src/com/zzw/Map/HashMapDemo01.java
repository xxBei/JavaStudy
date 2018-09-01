package com.zzw.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo01 {
    public static void main(String[] args) {

        //创键HashMap对象
        HashMap<String,String> hm = new HashMap<>();

        //添加元素
        hm.put("曹操","孟德");
        hm.put("刘备","玄德");
        hm.put("孙权","仲谋");

        //听过entrySet()获取数据
        Set<Map.Entry<String,String>> entries = hm.entrySet();

        //遍历集合
        for(Map.Entry<String,String> entry: entries){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("名:" + key + "------" + "字:" + value);
        }

        System.out.println("---------------------------");

        Set<String> keys = hm.keySet();

        for(String key : keys){
            String value = hm.get(key);
            System.out.println("名:" + key + "------" + "字:" + value);
        }
    }
}
