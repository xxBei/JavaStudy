package com.zzw.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@WebFilter(filterName = "LoginFilter",urlPatterns = "/*")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        final HttpServletRequest request = (HttpServletRequest) req;

        HttpServletRequest myReq = (HttpServletRequest) Proxy.newProxyInstance(LoginFilter.class.getClassLoader(), request.getClass().getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        Object obj = null;

                        if(method.getName().equalsIgnoreCase("getParameter")){
                            String mt = request.getMethod();
                            if ("get".equalsIgnoreCase(mt)){//get请求方法
                                obj = method.invoke(request,args);
                            }else{//post请求方式
                                request.setCharacterEncoding("utf-8");
                                obj = method.invoke(request,args);
                            }
                        }else{
                            obj = method.invoke(request,args);
                        }
                        return obj;
                    }
                });
        System.out.println(myReq.hashCode());
        chain.doFilter(myReq, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
