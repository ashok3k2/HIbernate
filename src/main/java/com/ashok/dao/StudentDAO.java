package com.ashok.dao;

import com.ashok.entity.Student;
import com.myntra.commons.dao.BaseDAO;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by ashok.maurya on 12/05/18.
 */
public interface StudentDAO extends BaseDAO<Student>{

    Student create(Student student);

    List<Student> findAll();
}
