package com.zzw.test;

import com.zzw.domain.Student;
import com.zzw.service.StudentService;
import com.zzw.service.impl.StudentServiceImpl;
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
}
