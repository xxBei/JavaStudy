package com.zzw.demo1;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 编写Action的方式三: 推荐使用方式
 *      继承ActionSupport
 *      ActionSupport中提供了数据校验,国际化等一系列操作的方法
 * */
public class Hello3Action extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("Hello3Action被执行了...");

        return super.execute();//默认调用的是success
    }
}
