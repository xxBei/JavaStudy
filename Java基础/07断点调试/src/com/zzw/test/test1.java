package com.zzw.test;

import java.util.Scanner;

public class test1 {
    /*
    * 需求:键盘录入月份，输入该月份对应的四季
    * 3、4、5：春
    * 6、7、8：夏
    * 9、10、11：秋
    * 12、1、2：冬
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份：");
        int yue = sc.nextInt();
        yuefenIf(yue);
        // yuefenSw(yue);
    }
    public static void yuefenIf(int yue){
        if(yue==3 || yue==4 || yue==5){
            System.out.println(yue+"月份为春季");
        }else if(yue==6 || yue==7 || yue==8){
            System.out.println(yue+"月份为夏季");
        }else if(yue==9 || yue==10 || yue == 11){
            System.out.println(yue+"月份为秋季");
        }else if(yue==12 || yue==1 || yue == 2){
            System.out.println(yue+"月份为冬季");
        }else{
            System.out.println("输入有误");
        }

    }

    /*public static void yuefenSw(int yue){
        switch (yue){
            case 3:
            case 4:
            case 5:
                System.out.println(yue + "月份为春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(yue + "月份为夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(yue + "月份为秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(yue + "月份为冬季");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }*/








}
