package com.healthcare.PrescriptionCare.exceptions;

import com.healthcare.PrescriptionCare.dtos.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UnableToSaveEntity.class)
    public ResponseEntity<ApiResponse> unableToSaveEntity(UnableToSaveEntity ex){
        return new ResponseEntity<>(new ApiResponse(false, "Unable to create Entity", ex.getObj(), ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
