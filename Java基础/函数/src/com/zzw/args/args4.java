package com.zzw.args;

import java.util.HashMap;
import java.util.Map;

public class args4 {
    /*
    * 把获取的数组最值改进为方法实现，并调用
    * */
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        Map<String,Integer> map = getzuizhi(arr);

        System.out.println("max:"+map.get("max"));
        System.out.println("min:"+map.get("min"));
    }

    // 定义获取数组最值的方法
    public static Map<String, Integer> getzuizhi(int[] arr){
        Map<String,Integer> map = new HashMap<String,Integer>();
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }
        map.put("max",max);
        map.put("min",min);

        return map;
    }
}
