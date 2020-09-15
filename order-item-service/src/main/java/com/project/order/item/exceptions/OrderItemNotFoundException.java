package com.project.order.item.exceptions;

import org.springframework.http.HttpStatus;

public class OrderItemNotFoundException extends RuntimeException {
    public OrderItemNotFoundException(Integer id) {
        super("Could not find order for :" + id);
    }
}
