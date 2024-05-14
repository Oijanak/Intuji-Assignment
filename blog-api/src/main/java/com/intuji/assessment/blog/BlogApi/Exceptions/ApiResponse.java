package com.intuji.assessment.blog.BlogApi.Exceptions;
//Class for sending custom api response for exception
public class ApiResponse {
    private String errorMessage;
    private String status;
    ApiResponse(){

    }

    public ApiResponse(String errorMessage, String status) {
        this.errorMessage = errorMessage;
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
