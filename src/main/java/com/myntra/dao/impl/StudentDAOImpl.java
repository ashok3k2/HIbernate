package com.myntra.dao.impl;

import com.myntra.dao.StudentDAO;
import com.myntra.entity.Student;
import com.myntra.commons.dao.impl.BaseDAOImpl;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by neha.talesra on 12/05/18.
 */
@Component
public class StudentDAOImpl extends BaseDAOImpl<Student> implements StudentDAO{

    @Override
    public List<Student> findAll() {
        List<Student> resultList = (List<Student>) this.entityManager.createNativeQuery("SELECT * FROM STUDENT", Student.class).getResultList();

        return resultList;
    }
}
