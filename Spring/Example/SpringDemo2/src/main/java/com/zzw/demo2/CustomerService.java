package com.zzw.demo2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service("CustomerService")
@Scope("prototype") //默认的是单例模式(singleton),现在将单例模式改为了多例模式,多例模式每次创建都会是一个新的
public class CustomerService {

    @PostConstruct //表示初始化
    public void init(){
        System.out.println("CustomerService初始化了....");
    }

    public void save(){
        System.out.println("CustomerService保存方法....");
    }

    @PreDestroy //表示销毁
    public void destory(){
        System.out.println("CustomerService被销毁了....");
    }
}
