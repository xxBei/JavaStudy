package com.zzw.service.impl;

import com.zzw.dao.StudentDao;
import com.zzw.dao.impl.StudentDaoImpl;
import com.zzw.domain.PageBean;
import com.zzw.domain.Student;
import com.zzw.service.StudentService;

import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Override
    public List<Student> findAll() throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        return dao.findAll();
    }

    @Override
    public void insertStuInfo(String sname, int gender, String phone, String birthday,
                              String info) throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        dao.insertStuInfo(sname,gender,phone,birthday,info);
    }

    @Override
    public void updateStu(String sname, String gender, String phone, String birthday,
                          String info,int sid) throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        dao.updateStu(sname,gender,phone,birthday,info,sid);

    }

    @Override
    public List<Student> findOther(int sid) throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        return dao.findOther(sid);
    }

    @Override
    public void deleteStudent(int sid) throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        dao.deleteStudent(sid);
    }

    @Override
    public List<Student> findName(String sname,String gender) throws SQLException {
        StudentDao dao = new StudentDaoImpl();
        return dao.findName(sname,gender);
    }

    @Override
    public PageBean findStudentByPage(int currentPage) throws SQLException {
        //封装分页的该页数据
        PageBean<Student> pageBean = new PageBean<>();

        StudentDao dao = new StudentDaoImpl();

        //当前页数
        pageBean.setCurrentPage(currentPage);
        //当前数据数
        pageBean.setPageSize(StudentDao.PAGE_SIZE);

        //当前页数的学生数
        List<Student> list = dao.findStudentByPage(currentPage);
        pageBean.setList(list);

        //总数据数
        int count = dao.findCount();
        pageBean.setTotalSize(count);

        //总页数
        int pageSize = StudentDao.PAGE_SIZE;
        pageBean.setTotalPage(count % pageSize == 0 ? count / pageSize :
                (count / pageSize)+1);
        return pageBean;
    }
}