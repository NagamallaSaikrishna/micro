package com.project.order.item.controller;

import com.project.order.item.common.OrderConstants;
import com.project.order.item.exceptions.OrderItemBadRequestException;
import com.project.order.item.exceptions.OrderItemNotFoundException;
import com.project.order.item.model.OrderItem;
import com.project.order.item.service.OrderItemService;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@Slf4j
@RestController
@RequestMapping("/order-item")
public class OrderItemController {

    private OrderItemService orderItemService;

    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @GetMapping
    public List<OrderItem> getOrderItems(){
        return orderItemService.getOrders();
    }

    @GetMapping("/{id}")
    public OrderItem getOrderItemsById(@PathVariable Integer id) {
        return orderItemService.getOrdersById(id).orElseThrow(() -> new OrderItemNotFoundException(id));
    }

    @PostMapping
    public ResponseEntity createOrderItem(@RequestBody OrderItem orders){
            if(Strings.isBlank(orders.getProductName()) || Strings.isEmpty(orders.getProductName()) )
                    throw new OrderItemBadRequestException(OrderConstants.PRODUCT_NAME);
            return ResponseEntity.ok(orderItemService.createOrder(orders));

    }

    @PutMapping("/{id}")
    public ResponseEntity saveOrderItem(@PathVariable Integer id,@RequestBody OrderItem orders){
         orderItemService.getOrdersById(id).orElseThrow(() -> new OrderItemNotFoundException(id));
         return ResponseEntity.ok(orderItemService.saveOrder(orders));
    }

    @DeleteMapping("/{id}")
    public void deleteOrderItem(@PathVariable Integer id){
        orderItemService.deleteOrder(id);
    }
}
