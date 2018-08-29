package com.zzw.extendsDemo;

/**
 * override 方法重写
 * super表示父类,
 * super.startGame表示调用方法
 * */
public class demo1 {
    public static void main(String[] args) {
        LOLGame lol = new LOLGame();
        lol.startGame();
    }
}
class Game{
    public Game(){}
    public void startGame(){
        System.out.println("启动游戏");
    }
    public void stopGame(){
        System.out.println("关闭游戏");
    }
}

class LOLGame extends Game{

    @Override
    public void startGame(){
        System.out.println("LOL启动");
        super.startGame();
    }
}
