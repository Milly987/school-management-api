package com.millyapi.school.managemnt.service;

public class UserNotFoundException extends  RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
