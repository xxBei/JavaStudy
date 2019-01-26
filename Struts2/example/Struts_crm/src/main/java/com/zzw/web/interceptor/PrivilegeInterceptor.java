package com.zzw.web.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.zzw.domain.User;
import org.apache.struts2.ServletActionContext;

/**
 * 添加用户权限(只有登录才能访问首页)
 * MethodFilterInterceptor  比 AbstractInterceptor 功能要强大一些
 * MethodFilterInterceptor 多了一个功能可以选择某个方法不被拦截
 * excludeMethods 方法可以用于不拦截方法
 * includeMethods 方法可以包含拦截什么方法
 * */
public class PrivilegeInterceptor extends MethodFilterInterceptor {


    @Override
    protected String doIntercept(ActionInvocation invocation) throws Exception {
        //判断session中是否有值
        User user = (User) ServletActionContext.getRequest().getSession().getAttribute(
                "user_login");

        //判断从session中获取的用户的信息是否为空
        if(user == null){
            //没有登录
            //给出提示,通过获取ActionSupport 的方式来获取addActionError方法来显示错误提示
            ActionSupport actionSupport = (ActionSupport) invocation.getAction();
            actionSupport.addActionError("没有登录!没有权限访问");
            //回到登录页面, 通过actionSupport的方式调用LOGIN
            return actionSupport.LOGIN;

        }else{
            //已经登录
            return invocation.invoke();
        }
    }
}











