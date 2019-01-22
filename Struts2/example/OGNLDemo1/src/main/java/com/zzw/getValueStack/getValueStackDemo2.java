package com.zzw.getValueStack;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.zzw.domain.User;

/**
 * 向值栈保存数据
 *  方式一: 使用ValueStack中本身的方法
 * */
public class getValueStackDemo2 extends ActionSupport {

    @Override
    public String execute() throws Exception {
        //获取值栈对象
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        User user = new User("zbei","123456");
        valueStack.push(user);//或者使用set()
        System.out.println("跳转成功GG");
        return SUCCESS;
    }
}
