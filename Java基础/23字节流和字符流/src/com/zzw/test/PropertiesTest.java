package com.zzw.test;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Properties : 是一个持久属性,可以保存到流中或从流中加载
 *      它实现了Map接口
 * 构造方法:
 *      Properties pro = new Properties();
 * */
public class PropertiesTest {
    public static void main(String[] args) {
        //创键Properties对象
        Properties pro = new Properties();
        //添加映射关系
        pro.put("001","张三");
        pro.put("002","李四");
        pro.put("003","王五");
        //遍历属性列表
        /*
        * 两种方法:
        *       获取所有的key,通过key获取value
        *       迭代器
        * */
        //获取所有的key,通过key获取value
        Set<Object> keys = pro.keySet();//获取所有key
        for(Object key : keys){
            Object value = pro.get(key);//根据key返回value
            System.out.println("key:"+key+"--"+"value:"+value);
        }
        System.out.println("-------------------");
        //迭代器
        Set<Map.Entry<Object, Object>> entrys = pro.entrySet();
        for(Map.Entry<Object,Object> entry : entrys){
            Object key = entry.getKey();//通过迭代器获取key
            Object value = entry.getValue();//通过迭代器获取value
            System.out.println("key:"+key+"--"+"value:"+value);
        }
    }
}
