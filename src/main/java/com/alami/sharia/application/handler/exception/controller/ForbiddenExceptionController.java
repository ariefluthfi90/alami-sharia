package com.alami.sharia.application.handler.exception.controller;

import com.alami.sharia.application.handler.exception.ForbiddenException;
import com.alami.sharia.application.handler.model.ResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ForbiddenExceptionController {

    private static final int CODE = HttpStatus.FORBIDDEN.value();

    @ExceptionHandler(value = ForbiddenException.class)
    public ResponseEntity<ResponseModel> exception(ForbiddenException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseModel(CODE, exception.getMessage()));
    }

}
