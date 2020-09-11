package com.aineurontech.StudentInfoServices.repository;

import com.aineurontech.StudentInfoServices.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.Optional;


@Repository
public interface StudentRepository extends CrudRepository<Student, Serializable> {


}
