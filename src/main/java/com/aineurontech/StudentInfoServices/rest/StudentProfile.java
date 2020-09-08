package com.aineurontech.StudentInfoServices.rest;


import com.aineurontech.StudentInfoServices.entity.Student;
import com.aineurontech.StudentInfoServices.repository.StudentRepository;
import com.aineurontech.StudentInfoServices.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentProfile {

    public StudentService studentService;

    public StudentRepository studentRepository;

    @Autowired
    public void setStudentService(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/profile")
    public List<Student> getProfile(){
        return studentService.retrieveStudent();
    }

    @PostMapping("/profile")
    public List<Student> postProfile(){
        return studentService.retrieveStudent();
    }

    @RequestMapping(value= "/profile-update/{Id}",
            produces = "application/json",
            method =RequestMethod.PUT)
//    @ResponseBody
//    public Optional<Student> updateStudent(@PathVariable Student newStudent, @PathVariable Integer id) {
//        return studentService.find(id).map(st ->{
//            st.setId(newStudent.getId());
//            st.setName(newStudent.getName());
//            st.setDob(newStudent.getDob());
//            return studentRepository.save(newStudent);
//        });
//    }

    @DeleteMapping("/profile/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        Optional<Student> st = studentRepository.findById(id);
        studentRepository.delete(st.get());
    }

}
