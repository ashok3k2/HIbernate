package com.ashok.main;

import com.ashok.entry.StudentEntry;
import com.ashok.service.impl.StudentServiceImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

/**
 * Created by ashok.maurya on 12/05/18.
 */
public class Test {

    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/application-context.xml");
        StudentServiceImpl bean = ctx.getBean(StudentServiceImpl.class);

//        long startTime = System.currentTimeMillis();
//        bean.testBulkUpload();
//
//        System.out.println("Total Time : "+(System.currentTimeMillis() - startTime));
        ArrayList<StudentEntry> studentEntries = new ArrayList<>();

        for (int i = 0;i<20;i++) {
            StudentEntry studentEntry = new StudentEntry();
            studentEntry.setName("UpdatedName");
            studentEntries.add(studentEntry);
        }

        long startTime = System.currentTimeMillis();
        bean.testBulkUpdate(studentEntries);
        System.out.println("Total Time : "+(System.currentTimeMillis() - startTime));
    }

}
