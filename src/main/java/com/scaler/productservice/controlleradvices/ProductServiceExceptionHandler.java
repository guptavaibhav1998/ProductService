package com.scaler.productservice.controlleradvices;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductServiceExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Void> handleRuntimeException(){
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleNullPointerException(NullPointerException exception){
        return new ResponseEntity<>("Please try again with a valid product id", HttpStatus.NOT_FOUND);
    }
} 
  