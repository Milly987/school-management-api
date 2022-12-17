package com.millyapi.school.managemnt.repository;

import com.millyapi.school.managemnt.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    Optional<Object> findTeacherById(Long id);

    Optional<Object> findStudentById(Long id);
}


