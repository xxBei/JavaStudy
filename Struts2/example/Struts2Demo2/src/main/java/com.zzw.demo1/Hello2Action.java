package com.zzw.demo1;

import com.opensymphony.xwork2.Action;

/**
 * 编写Action的方式二:
 *      实现Action接口,这个里面提供了execute方法
 *      提供了五个常量(五个逻辑视图的名称)
 *           String SUCCESS = "success";    : 表示成功了
 *           String NONE = "none";          : 表示失败了
 *           String ERROR = "error";        : 主要用于登录出错跳转
 *           String INPUT = "input";        : 主要用于表单校验出错
 *           String LOGIN = "login";        : 表示不跳转
 * */
public class Hello2Action implements Action {
    @Override
    public String execute() throws Exception {
        System.out.println("Hello2Action被执行了");
        return SUCCESS;
    }
}
