package com.project.order.item.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class OrderItemAdvice {

    @ResponseBody
    @ExceptionHandler(OrderItemNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String orderNotFoundHandler(OrderItemNotFoundException ex) {
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(OrderItemBadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    String orderBadRequestHandler(OrderItemBadRequestException ex) {
        return ex.getMessage();
    }
}
