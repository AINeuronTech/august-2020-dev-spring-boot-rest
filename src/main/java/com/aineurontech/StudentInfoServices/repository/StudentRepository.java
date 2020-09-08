package com.aineurontech.StudentInfoServices.repository;

import com.aineurontech.StudentInfoServices.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;


@Repository
public interface StudentRepository<Student,Id extends Serializable> extends CrudRepository<Student, Integer> {



}
