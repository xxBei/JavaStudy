package com.zzw.dongtaiDaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TestCar{


    /**
     * 动态代理
     * */
    public static void main(String[] args) {

        /**
         * @param1 固定值:告诉虚拟机用哪个字节码加载器加载内存中创键出的字节码文件
         * @param2 告诉虚拟机,内存中正在创建的字节码文件中应该有哪些方法
         * @param3 告诉虚拟机,正在被创键的字节码上各个方法如何处理
         * */
        ICar car = (ICar) Proxy.newProxyInstance(TestCar.class.getClassLoader(),
                GoogleCar.class.getInterfaces(),
                new InvocationHandler() {
                    //method: 表示正在执行的方法
                    //args: 表示正在执行方法中的参数
                    //Object: 表示方法执行完毕后的返回值
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //用于检测类方法中是否有一个方法叫做start
                        //equalsIgnoreCase: 忽略大小写比较
                        if(method.getName().equalsIgnoreCase("start")){
                            System.out.println("检测天气是否良好");
                            method.invoke(new GoogleCar(),args);
                            System.out.println("检测路况是否拥堵");

                        }else{
                            //执行类中的所有方法
                            method.invoke(new GoogleCar(),args);
                        }


                        return null;
                    }
                });

        car.start();
        car.run();
        car.stop();
    }
}
