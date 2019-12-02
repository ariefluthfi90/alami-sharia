package com.alami.sharia.application.handler.response;

import com.alami.sharia.application.handler.model.ResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {

    private ResponseHandler(){
        throw new IllegalStateException("Util Class");
    }

    public static ResponseEntity<Object> returnResponse(Object body){
        ResponseModel responseModel = new ResponseModel();
        responseModel.setBody(body);

        return ResponseEntity.status(responseModel.getResponseCode()).body(responseModel);
    }

    public static ResponseEntity<Object> returnResponse(int statusCode, String statusMessage, Object body){
        ResponseModel responseModel = new ResponseModel();

        if (statusCode != HttpStatus.OK.value()){
            responseModel.setResponseCode(statusCode);
            responseModel.setResponseMessage(statusMessage);
        }

        responseModel.setBody(body);

        return ResponseEntity.status(statusCode).body(responseModel);
    }


}
