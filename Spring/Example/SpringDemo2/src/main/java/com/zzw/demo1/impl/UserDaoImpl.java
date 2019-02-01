package com.zzw.demo1.impl;

import com.zzw.demo1.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//value 可以省略
//@Component(value = "UserDao") //这句话相当于<bean id="UserDao" class="com.zzw.demo1.impl.UserDaoImpl"></bean>

/**
 * Repository用于Dao层
 * Service用于Service层
 * Controller用于web层
 * 这些和 @Component作用一些,只是做了一些区分
 * */
@Repository(value = "UserDao")
public class UserDaoImpl implements UserDao {

    /**
     * 使用注解方式设置值:
     *      如果有 set方法, @Value必须写在set方法上面
     *      如果没有set方法,@value写在属性上面
     * */

    @Value("章仗")
    private String name;

    //@Value("章仗")
    /*public void setName(String name) {
        this.name = name;
    }*/

    @Override
    public void save() {
        System.out.println("UserDao的保存方法..."+name);
    }
}
