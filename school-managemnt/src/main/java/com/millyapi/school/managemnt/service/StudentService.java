package com.millyapi.school.managemnt.service;

import com.millyapi.school.managemnt.model.Staff;
import com.millyapi.school.managemnt.model.Student;
import com.millyapi.school.managemnt.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    @Autowired

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    public List<Student> findAllStudents(){
        return studentRepository.findAll();
    }
    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);

    }
    public Student findStudentById(Long id){
        return (Student) studentRepository.findStudentById (id)
                .orElseThrow(()->new UserNotFoundException("User by id "+ id + "was not found"));
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }


}
