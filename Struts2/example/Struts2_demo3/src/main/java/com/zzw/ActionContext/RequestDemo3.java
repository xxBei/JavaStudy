package com.zzw.ActionContext;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

public class RequestDemo3 extends ActionSupport implements ServletRequestAware, ServletContextAware {

    private HttpServletRequest request;
    private ServletContext context;

    @Override
    public String execute() throws Exception {
        /**
         * 一、接收参数
         * 利用Struts2中的接口注入方式中的ServletRequestAware获取request
         * */
        Map<String, String[]> map = request.getParameterMap();
        for(String key : map.keySet()){
            String[] values = map.get(key);
            System.out.println("key:"+key+"----"+"values:"+Arrays.toString(values));
        }


        /**
         * 二、向域对象存储数据
         * */
        request.setAttribute("reqName","接口注入:reqValue");
        request.getSession().setAttribute("sessName","接口注入:reqValue");
        context.setAttribute("appName","接口注入:reqValue");

        return SUCCESS;
    }

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    @Override
    public void setServletContext(ServletContext context) {
        this.context = context;
    }
}
