package com.zzw.getValueStack;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import com.zzw.domain.User;

import java.util.ArrayList;
import java.util.List;


public class getValueStackDemo4 extends ActionSupport {

    @Override
    public String execute() throws Exception {
        //向值栈中存储一个对象
        User user = new User("张三","abc");
        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.push(user);

        //向值栈存储一个集合
        List<User> list = new ArrayList<>();
        list.add(new User("aaa","111"));
        list.add(new User("bbb","222"));
        list.add(new User("ccc","333"));
        valueStack.set("list",list);
        return super.execute();
    }
}
