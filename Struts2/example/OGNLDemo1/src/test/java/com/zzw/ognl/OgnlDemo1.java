package com.zzw.ognl;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;
import org.junit.Test;

/**
 * OGNL 在java环境下的应用
 * */
public class OgnlDemo1 {

    @Test
    /*
    * OGNL调用对象的方法
    * */
    public void test01() throws OgnlException {
        //获取Context
        OgnlContext context = new OgnlContext();
        //获取跟对象
        Object root = context.getRoot();
        //获取数据或叫执行表达式 --- 查询字符串的长度
        Object obj = Ognl.getValue("'hello OGNL'.length()", context, root);
        System.out.println(obj);
    }
}
