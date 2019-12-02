package com.alami.sharia.application.service.interfaces;

import com.alami.sharia.application.handler.exception.NotFoundException;

import java.util.List;

public interface BaseService {

    List<?> GetAll();

    Object Get(String id) throws NotFoundException;

    Object Post(Object object);

    Object Put(String id, Object object) throws NotFoundException;

    Object Delete(String id) throws NotFoundException;

}
