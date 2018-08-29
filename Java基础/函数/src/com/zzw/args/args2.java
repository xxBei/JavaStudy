package com.zzw.args;

public class args2 {
    /*
    * 如果参数是引用数据类型
    *   形式参数的改变会影响实际参数
    * */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        change(arr);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


    public static void change(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                arr[i]*=2;
            }
        }
    }
}
