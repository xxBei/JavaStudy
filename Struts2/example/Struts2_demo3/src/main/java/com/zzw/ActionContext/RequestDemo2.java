package com.zzw.ActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.HttpParameters;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

public class RequestDemo2 extends ActionSupport {
    @Override
    public String execute() throws Exception {
        /**
         * 一、接收参数
         * 利用Struts2中的ServletActionContext对象获取request
         * */
        HttpServletRequest request = ServletActionContext.getRequest();
        Map<String, String[]> map = request.getParameterMap();
        for(String key : map.keySet()){
            String[] values = map.get(key);
            System.out.println("key:"+key+"----"+"values:"+ Arrays.toString(values));
        }

        /**
         * 二、向域对象存储数据
         * */
        request.setAttribute("reqName","reqValues");
        request.getSession().setAttribute("sessName","sessValues");
        ServletActionContext.getServletContext().setAttribute("appName","appValues");

        return SUCCESS;
    }
}
