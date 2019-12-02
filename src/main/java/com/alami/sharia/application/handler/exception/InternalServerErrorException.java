package com.alami.sharia.application.handler.exception;

public class InternalServerErrorException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private static final String INTERNAL_SERVER_ERROR = "Internal Server Error, please try again later";

    public InternalServerErrorException() {
        super(INTERNAL_SERVER_ERROR);
    }
}
