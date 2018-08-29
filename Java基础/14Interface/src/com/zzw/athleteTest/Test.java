package com.zzw.athleteTest;

/**
 * 需求:
 *      运动员案例
 *      篮球运动员和篮球教练需要去外国比赛,所以需要学习英语
 * */
public class Test {
    public static void main(String[] args) {
        //篮球运动员
        BaskBallPlayer bbp = new BaskBallPlayer();
        bbp.setName("姚明");
        bbp.setAge(36);
        bbp.setGender('男');
        bbp.study();
        bbp.speek();
        System.out.println("----------------");
        //篮球教练
        BaskBallCoach bbc = new BaskBallCoach();
        bbc.setName("王某");
        bbc.setAge(40);
        bbc.setGender('男');
        bbc.teach();
        bbc.speek();
        bbc.eat();
        System.out.println("----------------");
        //乒乓球运动员
        PingPongPlayer ppp = new PingPongPlayer();
        ppp.setName("张继科");
        ppp.setAge(28);
        ppp.setGender('男');
        ppp.study();
        ppp.sleep();
        System.out.println("----------------");
        //乒乓球教练
        PingPangCoach ppc = new PingPangCoach();
        ppc.setName("刘胖子");
        ppc.setAge(40);
        ppc.setGender('男');
        ppc.teach();
        ppc.sleep();
        System.out.println("----------------");

    }
}
