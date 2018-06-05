package com.myntra.entity;

import com.myntra.commons.entities.BaseEntity;

import javax.persistence.Entity;

/**
 * Created by neha.talesra on 12/05/18.
 */
@Entity(name = "student")
public class Student extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

}
