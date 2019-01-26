package com.zzw.web.action;

import com.opensymphony.xwork2.ActionSupport;

public class ActionDemo1 extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("ActionDemo1已执行...");
        return SUCCESS;
    }
}
