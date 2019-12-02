package com.alami.sharia.application.handler.model;

import org.springframework.http.HttpStatus;

public class ResponseModel {

    private int responseCode;
    private String responseMessage;
    private Object body;

    public ResponseModel() {
        this.responseCode = HttpStatus.OK.value();
        this.responseMessage = HttpStatus.valueOf(this.responseCode).toString();
    }

    public ResponseModel(int responseCode, String responseMessage) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
    }

    public ResponseModel(int responseCode, String responseMessage, Object body) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.body = body;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }
}
