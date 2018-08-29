package com.zzw.String_01;

import java.util.Scanner;

public class StringDemo1_test {
    /*
    * 需求:
    *   模拟登陆,给三次机会,并提示还有几次机会
    *
    * */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String user = "zBei";
        String pass = "zzz123456";
        for(int i=1;i<=3;i++){

            System.out.println("请输入用户名:");
            String username = sc.nextLine();
            System.out.println("请输入登陆密码:");
            String password = sc.nextLine();
            if(username.equals(user) && password.equals(pass)){
                System.out.println("登陆成功!");
                break;
            }else{
                System.out.println("输入有误,你还有"+(3-i)+"次机会");
            }
        }
    }
}
