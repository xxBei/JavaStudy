package com.zzw.getValueStack;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

public class getValueStackDemo5 extends ActionSupport {

    @Override
    public String execute() throws Exception {
        //给request设置值
        ServletActionContext.getRequest().setAttribute("name","r张某某");
        //给session设置值
        ServletActionContext.getRequest().getSession().setAttribute("name","s李某某");
        //给application设置值
        ServletActionContext.getServletContext().setAttribute("name","a邓某某");
        return super.execute();
    }
}
