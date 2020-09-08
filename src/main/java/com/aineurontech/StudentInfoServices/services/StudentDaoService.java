package com.aineurontech.StudentInfoServices.services;

import com.aineurontech.StudentInfoServices.entity.Student;

import java.util.Optional;

public interface StudentDaoService {

    public Optional<Student> find(Integer id);

    public Student update(Student student);

    public Iterable<Student> update(Iterable<Student> students);
}
