package org.chiches.summer_practice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionsHandler {
    @ResponseBody
    @ExceptionHandler(EntitiyNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String entityNotFoundExceptionHandler(EntitiyNotFoundException ex) {
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(BonusPointsIncorrectExceptions.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String bonusPointsIncorrectExceptionHandler(BonusPointsIncorrectExceptions ex) {
        return ex.getMessage();
    }
}
