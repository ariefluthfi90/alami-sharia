package com.alami.sharia.application.handler.exception;

public class NotFoundException extends Exception {

    private static final String NOT_FOUND = "Data Not Found";

    public NotFoundException() {
        super(NOT_FOUND);
    }

    public NotFoundException(String message) {
        super(message);
    }
}
