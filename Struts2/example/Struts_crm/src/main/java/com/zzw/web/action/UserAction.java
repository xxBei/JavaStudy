package com.zzw.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zzw.domain.User;
import com.zzw.service.Impl.UserServiceImpl;
import com.zzw.service.UserService;
import org.apache.struts2.ServletActionContext;

public class UserAction extends ActionSupport implements ModelDriven<User> {

    private User user = new User();

    @Override
    public User getModel() {
        return user;
    }

    public String login() throws Exception {
        UserService userService = new UserServiceImpl();
        User login = userService.Login(user);
        if(login!=null){
            //登录成功
            //ServletActionContext.getContext().getSession().put("user_login",login);
            //或者使用
            ServletActionContext.getRequest().getSession().setAttribute("user_login",login);
            return SUCCESS;
        }else{
            //登录失败
            this.addActionError("用户名或密码错误");
            return LOGIN;
        }
    }
}
