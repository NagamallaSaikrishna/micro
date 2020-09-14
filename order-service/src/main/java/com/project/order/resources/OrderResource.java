package com.project.order.resources;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.project.order.model.OrderItem;
import com.project.order.model.Orders;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderResource extends Orders {
    List<OrderItem> orderItems;
    public Orders copyOrders(Orders orders) {
        this.setId(orders.getId());
        this.setName(orders.getName());
        this.setOrderDate(orders.getOrderDate());
        this.setShippingAddress(orders.getShippingAddress());
        this.setTotal(orders.getTotal());
        return this;
    }
}
