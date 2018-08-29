package com.zzw.StringBuilder;

public class StringBuilderTest02 {
    /**
     * 将数组拼接成字符串
     * int[] arr = {1,2,3,4}
     * 输出: [1,2,3,4]
     * */
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        //定义一个方法,实现数组拼接字符串
        String strs = arrayToString(arr);
        //输出结果
        System.out.println(arrayToString(arr));
    }
        /**
         * 两个明确:
         *       返回值:String
         *       参数列表:int[]
         * */
        public static String arrayToString(int[] arr){
            //将String 转化为 StringBuilder
            StringBuilder sbArr = new StringBuilder();
            sbArr.append("[");
            for(int i=0; i<arr.length; i++){
                if(i == arr.length-1){
                    sbArr.append(arr[i]);
                }else{
                    sbArr.append(arr[i]).append(",");
                }
            }
            sbArr.append("]");
            String strs = sbArr.toString();
            return strs;
        }

}
