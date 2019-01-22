package com.zzw.ognl;

import com.zzw.domain.User;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;
import org.junit.Test;

/**
 * OGNL 在java环境下的应用
 * */
public class OgnlDemo1 {

    @Test
    /**
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

    @Test
    /**
     * OGNL调用静态对象的方法
     * */
    public void test02() throws OgnlException {
        //获取Context
        OgnlContext context = new OgnlContext();
        //获取根对象
        Object root = context.getRoot();
        //使用表达式,执行静态方法,(@类名@方法)
        Object value = Ognl.getValue("@java.lang.Math@random()", context, root);
        System.out.println(value);

    }

    @Test
    /**
     * OGNL访问Root中的数据，不需要加 #
     * */
    public void test03() throws OgnlException {
        //获取content
        OgnlContext context = new OgnlContext();
        User user = new User("zbei","123");
        //给root设置值
        context.setRoot(user);
        //获取root中的值
        Object root = context.getRoot();
        Object username = Ognl.getValue("username", context, root);
        Object password = Ognl.getValue("password", context, root);
        System.out.println(username+"=="+password);
    }

    @Test
    /**
     * OGNL访问context中的数据,需要加#
     * */
    public void test04() throws OgnlException {
        OgnlContext context = new OgnlContext();
        Object root = context.getRoot();
        context.put("name","abc");
        Object value = Ognl.getValue("#name", context, root);
        System.out.println(value);
    }
}
