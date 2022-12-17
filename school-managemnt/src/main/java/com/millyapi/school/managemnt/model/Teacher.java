package com.millyapi.school.managemnt.model;

import jakarta.persistence.*;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String name;
    private String subject;
    private int phoneNumber;
    private String address;

    public Teacher(Long id, String name, String subject, int phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Teacher(String name, String subject, int phoneNumber, String address) {
        this.name = name;
        this.subject = subject;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }
}
