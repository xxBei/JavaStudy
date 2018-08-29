package com.zzw.ArrayListTest;

import java.util.ArrayList;

public class ArrayListTest02 {
    /**
     * 需求:
     *      给定一个字符串数组,{"孙悟空","唐僧","猪八戒","沙僧","白龙马","孙行者","孙猴子"},
     *      将数组中的元素添加到集合中,并把姓孙的输出到控制台
     * */
    public static void main(String[] args) {
        //定义数组
        String[] strArr = {"孙悟空","唐僧","猪八戒","沙僧","白龙马","孙行者","孙猴子"};

        //创键ArrayList对象
        ArrayList<String> arrayList = new ArrayList<>();

        //遍历数组
        for(int i=0; i<strArr.length; i++){
            //向集合添加元素
            arrayList.add(strArr[i]);
        }

        //遍历集合
        for(int i=0; i<arrayList.size(); i++){
            String str = arrayList.get(i);
            //判断开头字符串是否是以"孙"开头的
            if(str.startsWith("孙")){
                System.out.println(str);
            }
        }

    }
}
