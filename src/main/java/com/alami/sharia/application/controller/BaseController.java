package com.alami.sharia.application.controller;

import com.alami.sharia.application.handler.exception.InternalServerErrorException;
import com.alami.sharia.application.handler.exception.NotFoundException;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;

public abstract class BaseController {

    public abstract ResponseEntity<?> GetAll();

    public abstract ResponseEntity<?> Get(String id) throws NotFoundException;

    public abstract ResponseEntity<?> Post(@Valid Object object) throws InternalServerErrorException;

    public abstract ResponseEntity<?> Put(String id, @Valid Object object) throws NotFoundException;

    public abstract ResponseEntity<?> Delete(String id) throws NotFoundException;

}
