package com.zzw.test;

public class test3 {
    /*
    * 不死神兔
    * */
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;

        for(int i=2;i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        System.out.println("第二十个月有"+arr[19]+"对兔子");
    }
}
