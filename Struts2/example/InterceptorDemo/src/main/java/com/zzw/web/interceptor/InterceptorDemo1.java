package com.zzw.web.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class InterceptorDemo1 extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("InterceptorDemo1已经执行...");
        String str = invocation.invoke();
        System.out.println("InterceptorDemo1执行完毕...");
        return str;
    }
}
