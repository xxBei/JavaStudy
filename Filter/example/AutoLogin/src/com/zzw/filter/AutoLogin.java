package com.zzw.filter;

import com.zzw.Utils.CookieUtils;
import com.zzw.dao.UserDao;
import com.zzw.dao.impl.UserImpl;
import com.zzw.domain.UserBean;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.sql.SQLException;

@WebFilter(filterName = "AutoLogin",urlPatterns = "/*")
public class AutoLogin implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        try {
            HttpServletRequest request = (HttpServletRequest) req;
            //先判断session中是否还存在userBean
            UserBean userBean = (UserBean) request.getSession().getAttribute("userBean");
            //不等于null,表示session中海油userBean
            if(userBean!=null){
                //放行
                chain.doFilter(request,response);
            }else {
                //代表session已经失效了

                //看cookie是否有值
                //1.请求的时候,先获取cookie,但是cookie里面有很多key-value
                Cookie[] cookies = request.getCookies();
                //2.从一堆cookie里面找出浏览器中的cookie
                Cookie cookie = CookieUtils.findCookie(cookies, "auto_login");

                //第一访问
                if (cookie == null) {
                    chain.doFilter(request, response);
                } else {
                    //不是第一次访问
                    String value = cookie.getValue();
                    //获取cookie里面的用户名
                    String uname = value.split("#user#")[0];
                    //获取cookie里面的密码
                    String upassword = value.split("#user#")[1];

                    //完成登录
                    UserBean user = new UserBean();
                    user.setUname(uname);
                    user.setUpassword(upassword);

                    UserDao dao = new UserImpl();
                    userBean = dao.login(user);

                    request.getSession().setAttribute("userBean",userBean);

                    //放行
                    chain.doFilter(request,response);
                }
            }

        }catch (SQLException e) {
            e.printStackTrace();
            chain.doFilter(req,response);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
