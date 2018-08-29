package com.zzw.List;

import java.util.ArrayList;
import java.util.List;

/**
 * 需求:
 *      1.根据元素求对应的索引值
 *      2.判断元素是否存在
 * */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("Java");

        //返回对应元素的索引
        int index = index(list,"Java");
        System.out.println(index);

        //判断元素是否存在
        boolean flag = contains(list,"Java");
        System.out.println(flag);

        //list自带判断元素是否存在的方法
        System.out.println(list.contains("world"));
    }
    /**
     * 两个明确:
     *      参数: List list, Object obj
     *      返回值: int index  索引
     */
    public static int index(List<String> list,Object obj){
        for(int i=0; i<list.size(); i++){
            //用于接收每一个元素
            String str = list.get(i);
            //将接收的元素和指定的元素进行比较
            if(str.equals(obj)){
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(List<String> list,Object obj){
        int flag = index(list,obj);
        if(flag >= 0){
            return true;
        }else {
            return false;
        }
    }
}
