package com.zzw.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 遍历map第二种方法 -- 对象
 * Set<Map.Entry<K,V>> entrySet()  使用该方法,来获取key和value
 * */
public class MapBianLi02 {
    public static void main(String[] args) {
        //创键Map对象
        Map<String,String> map = new HashMap<>();
        //存储数据
        map.put("曹操","孟德");
        map.put("刘备","玄德");
        map.put("孙权","仲谋");
        //通过Set<Map.Entry<String,String>> 存储每个数据
        Set<Map.Entry<String,String>> entries = map.entrySet();
        //遍历集合
        for (Map.Entry<String,String> entry : entries){
            //接收entry获取的key值
            String key = entry.getKey();
            //接收entry获取的value值
            String value = entry.getValue();
            System.out.println("名:"+ key +"-----"+ "字:" + value);
        }
    }
}
