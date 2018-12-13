package com.zzw.Utils;

public class TextUtils {

    /**
     * 判断某一个字符串是否为空。 CharSequence 是字符串的父级
     * @param s
     * @return
     */
    public static boolean isEmpty(CharSequence s){
        return s==null || s.length()==0;
    }
}
