package com.millyapi.school.managemnt.repository;

import com.millyapi.school.managemnt.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StaffRepository extends JpaRepository <Staff, Long>{
    Optional<Object> findStudentById(Long id);

    Staff findStaffById(Long id);

    Staff addStaff(Staff staff);

    Staff updateStaff(Staff staff);

    void deleteStaff(Long id);
}


