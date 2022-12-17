package com.millyapi.school.managemnt.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Administration implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String Name;
    private String position;
    private int phoneNumber;
    private  String address;

    public Administration(Long id, String name, String position, int phoneNumber, String address) {
        this.id = id;
        Name = name;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Administration(String name, String position, int phoneNumber, String address) {
        Name = name;
        this.position = position;
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
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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
        return "Administration{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                ", position='" + position + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }
}
