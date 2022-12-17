package com.millyapi.school.managemnt.controller;

import com.millyapi.school.managemnt.model.Staff;
import com.millyapi.school.managemnt.model.Student;
import com.millyapi.school.managemnt.repository.StaffRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class StaffController {
    private final StaffRepository staffRepository;

    public StaffController(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }
    @GetMapping("/getAllStaff")
    public ResponseEntity<List<Staff>> getAllStaff(){
        List<Staff> staffs=staffRepository.findAll();
        return new ResponseEntity<>(staffs, HttpStatus.OK);
    }
    @GetMapping("/getStaffById{id}")
    public ResponseEntity<Staff> getStaffById(@PathVariable("id")Long id){
      Staff staffs=staffRepository.findStaffById(id);
      return new ResponseEntity<>(staffs, HttpStatus.OK);
    }
    @PostMapping("/addStaff")
    public ResponseEntity<Staff>addStaff(  @RequestBody  Staff staff){
        Staff staffs =staffRepository.addStaff(staff);
        return new ResponseEntity<>(staffs, HttpStatus.CREATED);
    }
    @PutMapping("/updateStaff")
    public ResponseEntity<Staff>updateStaff(  @RequestBody  Staff staff){
        Staff staffs =staffRepository.updateStaff(staff);
        return new ResponseEntity<>(staffs, HttpStatus.OK);
    }
    @DeleteMapping("deleteStaff")
    public ResponseEntity<Staff> deleteStaffById(@PathVariable("id") Long id) {
        staffRepository.deleteStaff(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
