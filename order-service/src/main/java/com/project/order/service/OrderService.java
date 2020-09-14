package com.project.order.service;

import com.project.order.clients.OrderItemClient;
import com.project.order.model.OrderItem;
import com.project.order.model.Orders;
import com.project.order.repository.OrderRepository;
import com.project.order.resources.OrderResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class OrderService {

    private OrderRepository orderRepository;
    @Autowired
    private OrderItemClient orderItemClient;


    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<OrderResource> getOrders() {
        return  orderRepository.findAll().stream().map(orders -> fetchOrderItem(orders)).collect(Collectors.toList());
    }

    public Optional<Orders> getOrdersById(Integer id) {
        return orderRepository.findById(id);
    }

    public Orders createOrder(Orders orders) {
        return orderRepository.save(orders);
    }

    public Orders saveOrder(Orders orders) {
        return orderRepository.save(orders);
    }

    public void deleteOrder(Integer id) {
        orderRepository.deleteById(id);
    }

    public OrderResource fetchOrderItem(Orders existingOrders) {
        OrderResource orderResource =new OrderResource();
        orderResource.copyOrders(existingOrders);
        List<OrderItem> orderItems = orderItemClient.getOrderItem();
        orderResource.setOrderItems(orderItems);
        return orderResource;
    }
}
