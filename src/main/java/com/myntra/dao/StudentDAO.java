package com.myntra.dao;

import com.myntra.entity.Student;
import com.myntra.commons.dao.BaseDAO;

import java.util.List;

/**
 * Created by neha.talesra on 12/05/18.
 */
public interface StudentDAO extends BaseDAO<Student>{

    Student create(Student student);

    List<Student> findAll();
}
