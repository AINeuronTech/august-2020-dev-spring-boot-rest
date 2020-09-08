package com.aineurontech.StudentInfoServices.services;

import com.aineurontech.StudentInfoServices.entity.Student;
import com.aineurontech.StudentInfoServices.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class StudentService implements StudentDaoService{

    @Autowired
    public StudentRepository studentRepository;

    public StudentService(){}
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> retrieveStudent(){
        List<Student> listOfStudent = (List<Student>)studentRepository.findAll();

        return listOfStudent;
    }

    @Override
    public Optional<Student> find(Integer id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public Iterable<Student> update(Iterable<Student> students) {
        return null;
    }
}
