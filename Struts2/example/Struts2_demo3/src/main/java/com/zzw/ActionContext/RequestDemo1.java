package com.zzw.ActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.dispatcher.HttpParameters;

public class RequestDemo1 extends ActionSupport {
    @Override
    public String execute() throws Exception {
        /**
         * 一、接收参数
         * 利用Struts2中的ActionContext对象
         * */
        ActionContext context = ActionContext.getContext();
        //HttpParameters相当于Map<String,String[]> map = request.getParameters()
        //context.getParameters()可以用于获取从页面中传递的值
        HttpParameters parameters = context.getParameters();
        //将值通过遍历循环出来
        for (String key : parameters.keySet()) {
            //
            System.out.println("key:"+key+"------"+"value:"+parameters.get(key));
        }

        /**
         * 二、向域对象存储数据
         * */

        context.put("reqName","reqValue");//相当于request.setAttribute();
        context.getSession().put("sessName","sessValue");//session.setAttribute();
        context.getApplication().put("appName","appValue");//application.setAttribute();

        return SUCCESS;
    }
}
