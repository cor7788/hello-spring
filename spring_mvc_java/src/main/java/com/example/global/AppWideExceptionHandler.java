package com.example.global;

import com.example.exception.DuplicateUserException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppWideExceptionHandler {

    @ExceptionHandler(DuplicateUserException.class)
    public String handleDuplicateUser() {
        return "error/duplicate";
    }
}
