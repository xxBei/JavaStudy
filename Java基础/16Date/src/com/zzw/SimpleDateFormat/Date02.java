package com.zzw.SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date02 {
    public static void main(String[] args) throws ParseException {
//        method01();
        method02();
    }

    public static void method01() throws ParseException{
        //使用默认模式进行对象的创建
        SimpleDateFormat sdf = new SimpleDateFormat();
        //创建日期对象
        Date date = new Date();

        //格式化 把日期对象转换为字符串
        String s = sdf.format(date);
        System.out.println(s);//2018/8/28 下午4:21

        //解析 把字符串解析为日期对象
        Date d = sdf.parse("2018/8/28 下午4:21");
        System.out.println(d.toLocaleString());//2018年8月28日 下午4:23:00
    }

    public static void method02() throws ParseException {
//        SimpleDateFormat(String pattern);使用指定格式,对日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = new Date();

        //格式化 把日期对象转换为字符串
        String s = sdf.format(date);
        System.out.println(s);//2018年08月28日 16:39:15

//        解析 把字符串解析为日期对象
        Date d = sdf.parse("2018年08月28日 16:39:15");
        System.out.println(d.toLocaleString());//2018年8月28日 下午4:39:15
    }
}
