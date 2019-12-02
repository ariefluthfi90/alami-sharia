package com.alami.sharia.application.handler.exception;

public class ForbiddenException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private static final String FORBIDDEN = "You're forbidden to access this resource";

    public ForbiddenException() {
        super(FORBIDDEN);
    }

}
