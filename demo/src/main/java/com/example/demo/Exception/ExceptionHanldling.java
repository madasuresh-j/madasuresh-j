package com.example.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import  java.util.Map;
import java.util.HashMap;

@RestControllerAdvice
public class ExceptionHanldling {

     @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> badreqeusHandling(MethodArgumentNotValidException ex){

         Map<String,String> errorput=new HashMap<>();

         ex.getBindingResult().getAllErrors().forEach(er->{
            String field= er.getObjectName();
            String message=er.getDefaultMessage();
            errorput.put(field,message);
         });
         return errorput;
    }
}
