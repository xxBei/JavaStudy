package com.zzw.dao.impl;

import com.zzw.dao.TeacherDao;
import com.zzw.domain.TeacherInfo;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class TeacherDaoImpl extends HibernateDaoSupport implements TeacherDao {

    @Override
    public void findAll() {
        System.out.println("TeacherDao 中 findAll方法 查询所有学生...");
    }

    @Override
    public List<TeacherInfo> findByUsername(String th_username,String th_password) {
        DetachedCriteria criteria = DetachedCriteria.forClass(TeacherInfo.class);
        criteria.add(Restrictions.eq("th_username",th_username));
        criteria.add(Restrictions.eq("th_password",th_password));
        List<TeacherInfo> list =
                    (List<TeacherInfo>) this.getHibernateTemplate().findByCriteria(criteria);
        for (TeacherInfo teacherInfo : list) {
            if(teacherInfo.getTh_username().equals(th_username) && teacherInfo.getTh_password().equals(th_password)){
                return list;
            }
        }
        return null;
    }
}
