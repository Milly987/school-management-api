package com.millyapi.school.managemnt.repository;

import com.millyapi.school.managemnt.model.Administration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdministrationRepository extends JpaRepository<Administration,Long > {


    static Optional<Object> findAdministrationById(Long id) {
        return null;
    }
}
