package com.hand.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author bce1100
 * @date 2018/8/20.
 */
public abstract class BaseController {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleError(IllegalArgumentException ex){
        String message = ex.getMessage().replaceAll("[{=}]","");
        return ResponseEntity.badRequest().body(message);
    }

}
