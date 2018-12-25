package com.zzw.dongtaiDaili;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        //获取GoogleCar.class字节码文件中所有的接口,GoogleCar上可以有很多接口
        Class[] classes =  GoogleCar.class.getInterfaces();

        //遍历类,寻找类中的所有方法
        for (Class cla: classes) {
            //将类中所有方法存进Method中
            Method[] methods = cla.getMethods();
            //遍历方法
            for (Method met : methods){
                //找到每个方法名
                System.out.println(met.getName());
            }
        }
    }
}
