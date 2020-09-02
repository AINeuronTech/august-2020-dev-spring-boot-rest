package com.aineurontech.StudentInfoServices.rest;


import com.aineurontech.StudentInfoServices.entity.Student;
import com.aineurontech.StudentInfoServices.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentProfile {

    public StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/profile")
    public List<Student> getProfile(){
        return studentService.retrieveStudent();
    }


}
