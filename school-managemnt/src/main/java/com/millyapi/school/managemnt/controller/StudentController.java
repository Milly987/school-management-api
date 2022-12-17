package com.millyapi.school.managemnt.controller;

import com.millyapi.school.managemnt.model.Student;
import com.millyapi.school.managemnt.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/getAllStudents")
    public ResponseEntity <List<Student>> getAllStudents(){
        List<Student>students = studentService.findAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);


    }
    @GetMapping("/getStudentById/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id){
        Student students=studentService.findStudentById(id);
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @PostMapping("/addStudent")
    public ResponseEntity<Student>addStudent (@RequestBody Student student){
        Student students=studentService.addStudent(student);
        return new ResponseEntity<>( students, HttpStatus.CREATED);

    }
    @PutMapping("/updateStudent")
    public ResponseEntity<Student>updateStudent (@RequestBody Student student) {
        Student students = studentService.updateStudent(student);
        return new ResponseEntity<>(students, HttpStatus.OK);
    }
    @DeleteMapping("/deleteStudentById/[id}")
    public ResponseEntity<Student> deleteStudentById(@PathVariable("id") Long id) {
        studentService.deleteStudent(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


    }
