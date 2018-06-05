package com.ashok.dao.impl;

import com.ashok.dao.StudentDAO;
import com.ashok.entity.Student;
import com.myntra.commons.dao.impl.BaseDAOImpl;
import org.springframework.stereotype.Component;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by ashok.maurya on 12/05/18.
 */
@Component
public class StudentDAOImpl extends BaseDAOImpl<Student> implements StudentDAO{

    @Override
    public List<Student> findAll() {
        List<Student> resultList = (List<Student>) this.entityManager.createNativeQuery("SELECT * FROM STUDENT", Student.class).getResultList();

        return resultList;
    }
}
