package com.myntra.manager;

import com.myntra.entity.Student;
import com.myntra.entry.StudentEntry;
import com.myntra.commons.manager.BaseManager;

import java.util.List;

/**
 * Created by neha.talesra on 12/05/18.
 */
public interface StudentManager extends BaseManager<StudentEntry,Student> {

    List<StudentEntry> bulkCreate(List<Student> students);

    void bulkUpdate();
}
