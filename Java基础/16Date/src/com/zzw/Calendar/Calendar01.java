package com.zzw.Calendar;

import java.util.Calendar;

public class Calendar01 {
    public static void main(String[] args) {
        /**
         *  getInstance();使用默认时区和区域设置获取日历。
         *  get(int field);返回给定日历字段的值。
         *
         *
         *  set(int field,int value);将给定的日历字段设置为给定的值。
         *
         *  add(int field,int value);将指定的字段上加上指定的值
         *
         */
        Calendar c = Calendar.getInstance();
        /*设置时间*/
//        c.set(Calendar.DAY_OF_MONTH,20);//将本月的日修改为20日
//        c.add(Calendar.DAY_OF_MONTH,2);//将本月的日加2
//        c.add(Calendar.DAY_OF_MONTH,-1);//将本月的日-1

        /*获取时间*/
        int year = c.get(Calendar.YEAR);//获取年
        int month = c.get(Calendar.MONTH)+1;//获取月
        int day = c.get(Calendar.DAY_OF_MONTH);//获取日
        System.out.println(year+"年"+month+"月"+day+"日");
    }
}
