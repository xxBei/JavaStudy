package com.zzw.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapBianLi {
    public static void main(String[] args) {

        //创键map集合
        Map<String,Integer> map = new HashMap<>();

        //添加key和value
        map.put("刘备",30);
        map.put("关羽",28);
        map.put("张飞",26);

        //获取key值
        Set<String> keys = map.keySet();

        //循环获取key
        for(String key : keys){
            //根据key获取value值
            int value = map.get(key);
            System.out.println(key + "---" + value);
        }

    }
}
