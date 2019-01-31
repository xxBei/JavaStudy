package com.zzw.spring.test1;

public class CarInfo {
    /**
     * 用于给 Car1 和 Car2 提供值
     * */
    private String name;

    public String getName() {
        return "哈姆雷特";
    }

    public Double catculatePrice(){
        return Math.random() * 30000;
    }
}
