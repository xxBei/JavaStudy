package com.zzw.getValueStack;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;

/**
 * 获取值栈的方法
 * */
public class getValueStackDemo1 extends ActionSupport {

    @Override
    public String execute() throws Exception {

        /**
         * 方法一: 通过ActionContext获得值栈
         * */
        ValueStack valueStack1 = ActionContext.getContext().getValueStack();

        /**
         * 方法二: 通过request对象获取值栈
         * */
        ValueStack valueStack2 =
                (ValueStack) ServletActionContext.getRequest().getAttribute(ServletActionContext.STRUTS_VALUESTACK_KEY);


        //一个Action创建的实例,只会创建一个valueStack对象
        if(valueStack1.equals(valueStack2)){
            System.out.println("两个值栈相同");
        }else{
            System.out.println("两个值栈不同");
        }
        return NONE;
    }
}
