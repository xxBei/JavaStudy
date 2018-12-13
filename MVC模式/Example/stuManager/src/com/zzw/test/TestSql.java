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

    @Test
    public void stuUp(){
        StudentService service = new StudentServiceImpl();
        try {
            service.updateStu("曹操",1,"12333036666","155",
                        "曹操（155年－220年3月15日 [1]  " +
                                "），字孟德，一名吉利，小字阿瞒，沛国谯县（今安徽亳州）人。东汉末年杰出的政治家、军事家、文学家、书法家 [2]  " +
                                "，三国中曹魏政权的奠基人。",6);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void stuSel() throws SQLException {
        StudentService service = new StudentServiceImpl();
        List<Student> list = service.findOther(1);
        for(Student student : list){
            System.out.println(student.getSname()+":"+student.getBirthday());
        }
    }

   /* @Test
    public void stuFindName() throws SQLException {
        StudentService service = new StudentServiceImpl();
        List<Student> list = service.findName("诸",1);
        for(Student student : list){
            System.out.println(student.getSid()+student.getSname());
        }
    }*/

}
