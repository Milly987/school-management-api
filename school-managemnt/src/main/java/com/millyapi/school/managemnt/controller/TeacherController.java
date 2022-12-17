package com.millyapi.school.managemnt.controller;

import com.millyapi.school.managemnt.model.Student;
import com.millyapi.school.managemnt.model.Teacher;
import com.millyapi.school.managemnt.service.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }
    @GetMapping("/getAllTeachers")
    public ResponseEntity<List<Teacher>>getAllTeachers(){
        List<Teacher> teachers =teacherService.findAllTeachers();
        return new ResponseEntity<>(teachers, HttpStatus.OK);

    }
    @GetMapping("/getTeachersById/{id}")
    public ResponseEntity<Teacher>getTeacherById(@PathVariable("id")Long id){
        Teacher  teachers=teacherService.findTeacherById(id);
        return new ResponseEntity<>(teachers, HttpStatus.OK);


    }
    @PostMapping("/addTeacher")
    public ResponseEntity<Teacher> addTeacher(  @RequestBody Teacher teacher){
        Teacher teachers =teacherService.addTeacher(teacher);
        return new ResponseEntity<>(teachers, HttpStatus.CREATED);
    }
    @PutMapping("/updateTeacher")
    public ResponseEntity<Teacher>updateStudent (@RequestBody Teacher teacher) {
        Teacher teachers = teacherService.updateTeacher(teacher);
        return new ResponseEntity<>(teacher, HttpStatus.OK);
    }
    @DeleteMapping("/deleteStudentById/[id}")
    public ResponseEntity<Teacher> deleteTeacherById(@PathVariable("id") Long id) {
        teacherService.deleteTeacher(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
