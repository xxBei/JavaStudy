package com.zzw.athleteTest;

//教练类
public class BaskBallCoach extends Coach implements SpeekEnglish{

    @Override
    public void teach() {
        System.out.println("教篮球运动扣篮");
    }

    @Override
    public void speek() {
        System.out.println("学习说英语");
    }
}
