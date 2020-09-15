package com.project.order.item.exceptions;

public class OrderItemBadRequestException extends RuntimeException {
    public OrderItemBadRequestException(String name) {
        super("The following parameter is mandatory to place order :" + name);
    }
}
