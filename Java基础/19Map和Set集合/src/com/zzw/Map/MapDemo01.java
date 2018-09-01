package com.zzw.Map;

import java.util.*;

/**
  * Map 常用功能:
 *
  * */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        //V put(K key, V value) : 将指定的值与该映射中指定的键相关联,如果已存在相同键,会将里面对应的value覆盖掉。
        map.put("001","刘备");
        map.put("002","关羽");
        map.put("003","张飞");

        //int size() ： 获取集合的长度
        //System.out.println(map.size());

        //V get(Object key) ： 获取键对应的值
        //System.out.println(map.get("001"));

        //void clear() 清空集合
        //map.clear();

        //boolean isEmpty() ：  判断集合中的数据是否为空,为空返回true。
        //System.out.println(map.isEmpty());

        //boolean containsKey(Object key) ： 判断键是否存在
        //System.out.println(map.containsKey("002"));

        //boolean containsValue(Object value)  : 判断值是否存在
        //System.out.println(map.containsValue("关羽"));

        //V remove(Object key) ： 删除指定key所对应的关系数据
        //System.out.println(map.remove("003"));

        //Set<K> keySet()  : 获取map中所有的Key
        /*Set<String> key = map.keySet();
        for(String keys : key){
            System.out.println(keys);
        }*/

        //Collection<V> values()  : 获取map中所有的value
        Collection<String> values = map.values();
        for (String value : values){
            System.out.println(value);
        }


        System.out.println(map);
    }
}
