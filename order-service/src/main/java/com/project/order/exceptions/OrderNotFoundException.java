package com.project.order.exceptions;

import org.springframework.http.HttpStatus;

public class OrderNotFoundException  extends RuntimeException {
    public OrderNotFoundException(Integer id) {
        super("Could not find order for :" + id);
    }
}
