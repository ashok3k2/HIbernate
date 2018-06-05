package com.ashok.manager;

import com.ashok.dao.StudentDAO;
import com.ashok.entity.Student;
import com.ashok.entry.StudentEntry;
import com.myntra.commons.manager.BaseManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ashok.maurya on 12/05/18.
 */
public interface StudentManager extends BaseManager<StudentEntry,Student> {

    List<StudentEntry> bulkCreate(List<Student> students);

    void bulkUpdate();
}
