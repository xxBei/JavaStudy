package com.zzw.String_01;

public class StringDemo4_test1 {
    /**
     * 需求:
     *      把数组的数据按照指定格式拼接成一个字符串
     *      举例: int[] arr = {1,2,3,4}
     *      输出结构: [1,2,3,4]
     * */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        String strs = arrayToString(arr);
        System.out.println(strs);
    }

    public static String arrayToString(int[] arr){
        String str = "";
        str += "[";
        for(int i=0; i<arr.length; i++){
            if(i == arr.length-1){//判断数组是否为最后一个
                str += arr[i];

            }else{
                str += arr[i];
                str += ",";
            }
        }
        str += "]";
        return str;
    }
}
