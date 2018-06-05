package com.myntra.service.impl;

import com.myntra.entity.Student;
import com.myntra.entry.StudentEntry;
import com.myntra.manager.StudentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by neha.talesra on 12/05/18.
 */
@Component
public class StudentServiceImpl {

    @Autowired
    private StudentManager studentManager;
//    public void test(){
//        System.out.println("Service");
//        studentManager.test();
//    }

    public void testBulkUpload(){
        int numberOfStudent = 10000;

        List<Student> students = new ArrayList<>();
        for (int i = 0; i< numberOfStudent;i++){
            Student student = new Student();
            student.setName("Neha Test "+i);
            students.add(student);
        }

        List<StudentEntry> studentEntries = studentManager.bulkCreate(students);
//        studentEntries.forEach(entry -> {
//            System.out.println(entry.getName() + " "+entry.getId());
//        });
    }

    public void testBulkUpldate(){
        studentManager.bulkUpdate();
    }

    public void testBulkUpdate(List<StudentEntry> studentEntries) throws Exception {
        studentManager.bulkUpdate();
//        studentManager.update(studentEntries.get(0),140L);
    }
//    @Autowired
//    private StudentManagerImpl studentManager;
//
//    public void setStudentManager(StudentManager studentManager) {
//        this.studentManager = studentManager;
//    }
}
