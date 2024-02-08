package com.backend.aviation.expections;

public class BadRequestException extends RuntimeException {

    public BadRequestException(String message) {
        super(message);
    }

}

