package com.zzw.timeDemo;

import javax.servlet.http.Cookie;
import java.text.SimpleDateFormat;
import java.util.Date;

public class cookieUtil {
    /*从一个cookie中找到具体我们想要的cookie对象*/
    public static Cookie findCookie(Cookie[] cookies,String name){
        if(cookies != null){
            for (Cookie cookie:cookies) {
                if(name.equals(cookie.getName())){
                    return cookie;
                }
            }
        }
        return null;
    }

    /*获取时间,并返回*/
    public static String getDates(){
        Date date = new Date();
        //将时间转为正常时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd==HH:mm:ss");
        String dateString =  simpleDateFormat.format(date);
        return dateString;
    }
}
