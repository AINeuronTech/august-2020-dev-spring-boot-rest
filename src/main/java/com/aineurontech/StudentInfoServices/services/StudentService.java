package com.aineurontech.StudentInfoServices.services;

import com.aineurontech.StudentInfoServices.entity.Student;
import com.aineurontech.StudentInfoServices.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService {

    @Autowired
    public StudentRepository studentRepository;

    public List<Student> retrieveStudent(){
        List<Student> listOfStudent = (List<Student>)studentRepository.findAll();

        return listOfStudent;
    }

    public void createStudent(Student student){
        studentRepository.save(student);
    }

    public Optional<Student> findById(Integer id){
        return studentRepository.findById(id);
    }

    public Student update(Student student, Integer id){
        return studentRepository.save(student);
    }

//    public void deleteStudentById(Integer id){
//        studentRepository.delete(id);
//    }

}
