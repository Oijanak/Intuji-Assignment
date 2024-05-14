package com.intuji.assessment.blog.BlogApi.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    //Handling all the Exception from api requests

    @ExceptionHandler(BlogNotFoundException.class)
    ResponseEntity<ApiResponse> blogNotFoundException(BlogNotFoundException ex){
        return new ResponseEntity<>(new ApiResponse(ex.getMessage(),"Failure"), HttpStatus.NOT_FOUND);
    }
}
