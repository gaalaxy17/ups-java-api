package com.gaalaxy.api.Commons;

public class ResponseModel {

    private String message;
    private Integer responseStatus;
    private Object data;

    public ResponseModel(){

    }

    public ResponseModel(String message, Integer responseStatus) {
        this.message = message;
        this.responseStatus = responseStatus;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(Integer responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
