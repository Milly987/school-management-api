package com.millyapi.school.managemnt.controller;

import com.millyapi.school.managemnt.model.Administration;
import com.millyapi.school.managemnt.model.Student;
import com.millyapi.school.managemnt.service.AdministrationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("administration")
public class AdministrationController {
    private final AdministrationService administrationService;

    public AdministrationController(AdministrationService administrationService) {
        this.administrationService = administrationService;
    }
    @GetMapping("/getAllAdministration")
    public ResponseEntity<List<Administration>>getAllAdministration(){
        List<Administration>administrations = administrationService.findAllAdministration();
        return new ResponseEntity<>(administrations, HttpStatus.OK);
    }
    @GetMapping("/getAdministrationById/{id}")
    public ResponseEntity<Administration> getAdministrationById(@PathVariable("id") Long id){
        Administration administration=administrationService.findAdministrationById(id);
        return new ResponseEntity<>(administration, HttpStatus.OK);
    }
    @PostMapping("/addAdministration")
    public ResponseEntity<Administration>addAdministration (@RequestBody Administration administration){
        Administration administration1=administrationService.addAdministration(administration);
        return new ResponseEntity<>( administration, HttpStatus.CREATED);

    }
    @PutMapping("/updateAdministration")
    public ResponseEntity<Administration>updateAdministration(@RequestBody Administration administration) {
        Administration administration1 = administrationService.updateAdministration(administration);
        return new ResponseEntity<>(administration, HttpStatus.OK);
    }
    @DeleteMapping("deleteAdministrationById/{id}")
    public ResponseEntity<Administration> deleteAdministrationById(@PathVariable("id") Long id) {
        administrationService.deleteAdministration(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
