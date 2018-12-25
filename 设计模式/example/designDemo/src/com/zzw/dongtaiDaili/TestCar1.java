package com.zzw.dongtaiDaili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class TestCar1 {

    public static void main(String[] args) {
        ICar1 car = (ICar1) Proxy.newProxyInstance(TestCar1.class.getClassLoader(),GoogleCar1.class.getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //表示每个方法完毕后的对象
                        Object obj = null;
                        System.out.println(Arrays.toString(args));
                        if(method.getName().equalsIgnoreCase("start")){
                            System.out.println("检查天气是否良好");
                            obj = method.invoke(new GoogleCar1(),args);
                            System.out.println("检查天气是否良好");
                        }else{
                            obj = method.invoke(new GoogleCar1(),args);
                        }
                        return obj;
                    }
                });

        String str = car.start(2,4);
        System.out.println(str);
        car.run();
        car.stop();
    }
}
