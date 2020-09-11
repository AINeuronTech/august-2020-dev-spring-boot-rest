package com.aineurontech.StudentInfoServices.rest;


import com.aineurontech.StudentInfoServices.entity.Student;
import com.aineurontech.StudentInfoServices.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentProfile {

    public StudentService studentService;

    @Autowired
    public void setStudentService(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping(value = "/get-profile", headers = "Accept=application/json")
    public List<Student> getProfile(){
        return studentService.retrieveStudent();
    }

    @PostMapping(value = "/post-profile", headers = "Accept=application/json")
    public ResponseEntity<Void> createProfile(@RequestBody Student student, UriComponentsBuilder uriComponentsBuilder){
        studentService.createStudent(student);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uriComponentsBuilder.path("/api/{id}").buildAndExpand(student.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @PutMapping(value = "/update-profile", headers = "Accept=application/json")
    public ResponseEntity<String> updateProfile(@RequestBody Student currentStudent){
        Optional<Student> updatedStudent = studentService.findById(currentStudent.getId());
        if(updatedStudent==null){
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
        studentService.update(currentStudent,currentStudent.getId());
        return new ResponseEntity<String>(HttpStatus.OK);

    }

    @DeleteMapping(value = "/{id}", headers = "Accept=application/json")
    public ResponseEntity<String> updateProfile(@PathVariable("id") Integer id){
        Optional<Student> student = studentService.findById(id);
        if(student==null){
            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
        }
        //studentService.deleteStudentById(id);
        return new ResponseEntity<String>(HttpStatus.NO_CONTENT);

    }


}
