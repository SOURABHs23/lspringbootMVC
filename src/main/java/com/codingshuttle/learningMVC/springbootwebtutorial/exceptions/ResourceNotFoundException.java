package com.codingshuttle.learningMVC.springbootwebtutorial.exceptions;

public class ResourceNotFoundException extends RuntimeException {


    public ResourceNotFoundException(String message) {
        super(message);
    }
}
