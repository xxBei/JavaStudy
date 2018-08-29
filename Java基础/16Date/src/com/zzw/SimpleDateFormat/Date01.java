package com.zzw.SimpleDateFormat;

import java.util.Date;

public class Date01 {
    public static void main(String[] args) {
        /**
         * 创键Date对象有两种方法:
         *      Date date = new Date();
         *      Date date = new Date(long date);
         * */

        //方法一:
        //public Date()---分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒）
        /*Date d = new Date();
        System.out.println(d);//Tue Aug 28 16:03:05 CST 2018*/

        //方法二:
        //public Date(long date)---根据给定的毫秒值创建日期对象
        //long time = System.currentTimeMillis();//获取的当前的时间戳
        /*Date date = new Date(time);
        System.out.println(date);
        System.out.println(time);*/

        //public long getTime()——日期转毫秒值
        //通过getTime方法可以将一个日期类型转换为long类型的毫秒值
        /*Date date = new Date();
        System.out.println("当前毫秒值:"+date.getTime());*/

        //public void setTime(long time)——毫秒值转日期
        Date date = new Date();
        date.setTime(1477234414353L);
        System.out.println(date.toLocaleString());//2016年10月23日 下午10:53:34


    }
}
