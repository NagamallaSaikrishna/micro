package com.project.order.clients;

import com.project.order.model.OrderItem;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Component
@FeignClient(value = "order-item-service", url = "${feign-client.order-item-service.url}")
public interface OrderItemClient {

    @GetMapping(value = "/order-item", produces = "application/json")
    List<OrderItem> getOrderItem();
}
