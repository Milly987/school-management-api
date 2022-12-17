package com.millyapi.school.managemnt.model;

import jakarta.annotation.Generated;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;
    @Column(nullable = false, updatable = false)

    private Long Id;
    private String parentName;
    private double fee;
    private int phoneNumber;
    private String address;


    public Student(String name, String parentName, double fee, int phoneNumber, String address) {
        this.name = name;
        this.parentName = parentName;
        this.fee = fee;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Student(String name, Long id, String parentName, double fee, int phoneNumber, String address) {
        this.name = name;
        Id = id;
        this.parentName = parentName;
        this.fee = fee;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
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
        return "Student{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", parentName='" + parentName + '\'' +
                ", fee=" + fee +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }
}
