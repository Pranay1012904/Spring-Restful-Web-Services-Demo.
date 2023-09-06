package com.spring.RestApi.exception;

public class EmailExistsException extends RuntimeException{
    public EmailExistsException(String message) {
        super(message);
        this.message = message;
    }

    private String message;

}
