package com.millyapi.school.managemnt.service;

import com.millyapi.school.managemnt.model.Staff;
import com.millyapi.school.managemnt.model.Student;
import com.millyapi.school.managemnt.repository.StaffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {
    private final StaffRepository staffRepository;
    @Autowired
    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }
    public List<Staff>findAllStaffs() {
        return staffRepository.findAll();
    }
    public Staff updateStaff( Staff staff){
        return staffRepository.save(staff);
    }
    public Staff addStaff(Staff staff){
        return staffRepository.save(staff);
    }
    public void deleteStaff(Long id){
        staffRepository.deleteById(id);
    }
    public Staff findStaffById(Long id){
        return (Staff) staffRepository.findStudentById (id)
                .orElseThrow(()->new UserNotFoundException("User by id "+ id + "was not found"));
    }

}
