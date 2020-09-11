package com.aineurontech.StudentInfoServices.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Student",schema="university")
public class Student {

    @Id
    @GeneratedValue
    private int Id;
    private String name;
    private String dob;

    public Student(){}
    public Student(int id, String name, String dob) {
        Id = id;
        this.name = name;
        this.dob = dob;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
