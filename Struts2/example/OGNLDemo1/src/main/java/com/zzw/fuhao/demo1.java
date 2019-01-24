package com.zzw.fuhao;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class demo1 extends ActionSupport {

    @Override
    public String execute() throws Exception {
        List<String> list = new ArrayList<>();
        list.add("List_aaa");
        list.add("List_bbb");
        list.add("List_ccc");

        ValueStack valueStack = ActionContext.getContext().getValueStack();
        valueStack.set("list",list);

        Map<String,String> map = new HashMap<>();
        map.put("map1","map_aaa");
        map.put("map2","map_bbb");
        map.put("map3","map_ccc");
        valueStack.set("map",map);

        return super.execute();
    }
}
