package com.alami.sharia.application.handler.exception.controller;

import com.alami.sharia.application.handler.exception.NotFoundException;
import com.alami.sharia.application.handler.model.ResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class NotFoundExceptionController {

    private static final int NOT_FOUND_CODE = HttpStatus.NOT_FOUND.value();

    @ExceptionHandler(value = NotFoundException.class)
    public ResponseEntity<ResponseModel> exception(NotFoundException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseModel(NOT_FOUND_CODE, exception.getMessage()));
    }

}
