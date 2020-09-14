package com.project.order.exceptions;

public class OrderBadRequestException extends RuntimeException {
    public OrderBadRequestException(String name) {
        super("The following parameter is mandatory to place order :" + name);
    }
}
