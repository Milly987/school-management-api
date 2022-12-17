package com.millyapi.school.managemnt.service;

import com.millyapi.school.managemnt.model.Staff;
import com.millyapi.school.managemnt.model.Teacher;
import com.millyapi.school.managemnt.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    private final TeacherRepository teacherRepository;
    @Autowired

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
    public List<Teacher> findAllTeachers(){
        return teacherRepository.findAll();

    }
    public Teacher addTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }
    public Teacher updateTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }
    public void  deleteTeacher(Long id){
        teacherRepository.deleteById(id);

    }
    public Staff findTeacherById(Long id){
        return (Staff) teacherRepository.findStudentById (id)
                .orElseThrow(()->new UserNotFoundException("User by id "+ id + "was not found"));

}
}
