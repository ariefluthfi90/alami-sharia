package com.alami.sharia.application.handler.exception.controller;

import com.alami.sharia.application.handler.exception.InternalServerErrorException;
import com.alami.sharia.application.handler.model.ResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class InternalServerErrorExceptionController {

    private static final int CODE = HttpStatus.INTERNAL_SERVER_ERROR.value();

    @ExceptionHandler(value = InternalServerErrorException.class)
    public ResponseEntity<ResponseModel> exception(InternalServerErrorException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ResponseModel(CODE, exception.getMessage()));
    }

}
