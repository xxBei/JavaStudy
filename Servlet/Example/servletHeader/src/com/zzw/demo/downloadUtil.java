package com.zzw.demo;


import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class downloadUtil {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Base64.Decoder decoder = Base64.getDecoder();
        Base64.Encoder encoder = Base64.getEncoder();
        String text = "字串文字";
        byte[] textByte = text.getBytes("UTF-8");
        //编码
        String encodedText = encoder.encodeToString(textByte);
        System.out.println("encode:"+encodedText);
        //解码
        encodedText = new String(decoder.decode(encodedText),"utf-8");
        System.out.println("decode:"+encodedText);
        /*System.out.println(new String(decoder.decode(encodedText), "UTF-8"));*/
    }
}
