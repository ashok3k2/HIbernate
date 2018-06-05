package com.myntra.manager.impl;

import com.myntra.dao.StudentDAO;
import com.myntra.entity.Student;
import com.myntra.entry.StudentEntry;
import com.myntra.manager.StudentManager;
import com.myntra.commons.exception.DaoException;
import com.myntra.commons.manager.impl.BaseManagerImpl;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by neha.talesra on 12/05/18.
 */
@Component
public class StudentManagerImpl extends BaseManagerImpl<StudentEntry,Student> implements StudentManager{

    private StudentDAO studentDAO;

    @Override
    @Transactional
    public List<StudentEntry> bulkCreate(List<Student> students) {

        List<StudentEntry> studentEntries = new ArrayList<>();

        try {
            List<Student> students1 = getDao().bulkCreate(students);

            students1.forEach(entity ->{
                StudentEntry studentEntry = new StudentEntry();
                studentEntry.setName(entity.getName());
                studentEntry.setId(entity.getId());
                studentEntries.add(studentEntry);
            });
        } catch (DaoException e) {
            e.printStackTrace();
        }
        return studentEntries;
    }

    @Transactional
    public void bulkUpdate(){
        List<Student> list = new ArrayList<>();
        List<Student> students = ((StudentDAO)getDao()).findAll();
        for (Student studentEntry : students) {
            Student entity = new Student();
            entity.setName(studentEntry.getName()+"UpdatedNew");
            entity.setVersion(studentEntry.getVersion());
            entity.setId(studentEntry.getId());
            list.add(entity);
        }
//         try {
//
//        } catch (ManagerException e) {
//
//        }

        try {
            getDao().bulkUpdate(list,50);
        } catch (DaoException e) {
            e.printStackTrace();
        }
    }

    public void setStudentDAO(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
}
