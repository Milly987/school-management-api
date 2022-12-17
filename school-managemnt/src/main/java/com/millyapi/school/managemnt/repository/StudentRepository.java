package com.millyapi.school.managemnt.repository;

import com.millyapi.school.managemnt.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Optional<Object> findStudentById(Long id);
}
