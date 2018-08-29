package com.zzw.args;

public class args3 {
    /*
    * 遍历数组
    * */
    public static void main(String[] args) {
        int[] intArr = {11,22,33,44,55,66};
        String[] strArr = {"你","是","最","帅","的"};
        xunhuan(intArr);
        xunhuan(strArr);
    }

    // 定义一个遍历数组的方法
    public static void xunhuan(int[] intArr){
        System.out.print("[");
        for(int i=0;i<intArr.length;i++){
            if(i == intArr.length-1){
                System.out.println(intArr[i]+"]");
            }else{
                System.out.print(intArr[i]+", ");
            }

        }
    }
    public  static void xunhuan(String[] strArr){
        for(int i=0;i<strArr.length;i++){
            System.out.print(strArr[i]);
        }
    }
}
