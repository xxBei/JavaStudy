package com.zzw.dao.impl;

import com.zzw.dao.StudentDao;
import com.zzw.domain.StudentInfo;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {

    @Override
    public List<StudentInfo> findAll(StudentInfo studentInfo) {
        DetachedCriteria criteria = DetachedCriteria.forClass(StudentInfo.class);
        criteria.add(Restrictions.eq("stu_class",studentInfo.getStu_class()));
        List<StudentInfo> list = (List<StudentInfo>) this.getHibernateTemplate().findByCriteria(criteria);
        return list;
    }

    @Override
    public void addStudent(StudentInfo studentInfo) {
        this.getHibernateTemplate().save(studentInfo);
        System.out.println(studentInfo);
    }

    @Override
    public List<StudentInfo> findStuByStuId(StudentInfo studentInfo) {
        DetachedCriteria criteria = DetachedCriteria.forClass(StudentInfo.class);
        criteria.add(Restrictions.eq("stu_id",studentInfo.getStu_id()));
        List<StudentInfo> list = (List<StudentInfo>) this.getHibernateTemplate().findByCriteria(criteria);
        return list;
    }
}
