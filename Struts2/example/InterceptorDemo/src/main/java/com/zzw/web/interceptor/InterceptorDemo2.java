package com.zzw.web.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class InterceptorDemo2 extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("InterceptorDemo2已经执行...");
        String str = invocation.invoke();
        System.out.println("InterceptorDemo2执行完毕...");
        return str;
    }
}
