package com.zzw.myObject;

/**
 * 创建一个电脑类
 *  成员变量:品牌,价格,颜色...
 *  成员方法:打游戏,工作,看视频...
 * */
public class Computer {
    //成员变量:
    String brand;
    int price;
    String color;

    //成员方法:
    public void playGame(String gameName){
        System.out.println("打"+gameName+"游戏");
    }
    public void work(){
        System.out.println("做工作");
    }
    public void seeVideo(String videoName){
        System.out.println("看"+videoName);
    }
}
