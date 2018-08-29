package com.zzw.arrayDemo;

public class arrayDemo3 {
    public static void main(String[] args) {
        /*
        * 获取数组中最大值或最小值
        * */
        int[] arr = {100,200,300,400,800};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("最大值为:"+max);

        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("最小值为:"+min);
    }
}
