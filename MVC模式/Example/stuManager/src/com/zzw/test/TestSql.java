package com.zzw.test;

import com.zzw.domain.Student;
import com.zzw.domain.User;
import com.zzw.service.StudentService;
import com.zzw.service.UserLoginService;
import com.zzw.service.impl.StudentServiceImpl;
import com.zzw.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

public class TestSql {

    /**
     * 用于简单的代码测试
     * */
    @Test
    public void test(){
        StudentService service = new StudentServiceImpl();
        try {
            List<Student> list = service.findAll();
            for(Student student : list){
                System.out.println(student.getSid()+":"+student.getSname()+":"+student.getInfo());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1(){
        UserLoginService user = new UserServiceImpl();
        try {
            List<User> list = user.user_login();
            for(User users:list){
                System.out.println(users.getUname()+":"+users.getUpassword());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void strLen(){
        String str = "123456abcd";
//        System.out.println(str.substring(str.length()-3,str.length()));
        if(str.length()>3){
            System.out.println(str.substring(0,3)+"..."+str.substring(str.length()-3,
                    str.length()));
            //System.out.println(str.split(0,3));
        }
    }
}
