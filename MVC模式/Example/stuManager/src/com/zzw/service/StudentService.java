package com.zzw.service;

import com.zzw.domain.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentService {

    List<Student> findAll() throws SQLException;
}
