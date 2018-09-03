package com.zzw.Exction;

/**
 * 自定义异常
 * */
public class Excetion extends RuntimeException{
    public Excetion() {
    }

    public Excetion(String message) {
        super(message);
    }
}
