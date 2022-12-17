package com.millyapi.school.managemnt.service;

import com.millyapi.school.managemnt.model.Administration;
import com.millyapi.school.managemnt.model.Student;
import com.millyapi.school.managemnt.repository.AdministrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AdministrationService {
    private final AdministrationRepository administrationRepository;
    @Autowired

    public AdministrationService(AdministrationRepository administrationRepository) {
        this.administrationRepository = administrationRepository;
    }
    public List<Administration> findAllAdministration(){
        return administrationRepository.findAll();
    }
    public Administration updateAdministration( Administration administration){
        return administrationRepository.save(administration);
    }
    public Administration addAdministration(Administration administration){
        return administrationRepository.save(administration);

    }
    public void  deleteAdministration(Long id){
        administrationRepository.deleteById(id);

    }
    public Administration findAdministrationById(Long id){
        return (Administration) AdministrationRepository.findAdministrationById (id)
                .orElseThrow(()->new UserNotFoundException("User by id "+ id + "was not found"));
    }


}
