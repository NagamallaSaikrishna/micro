package com.project.order.item.service;

import com.project.order.item.model.OrderItem;
import com.project.order.item.repository.OrderItemRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class OrderItemService {

    private OrderItemRepository orderItemRepository;

    @Autowired
    public OrderItemService(OrderItemRepository orderItemRepository) {
        this.orderItemRepository = orderItemRepository;
    }

    public List<OrderItem> getOrders() {
        return orderItemRepository.findAll();
    }

    public Optional<OrderItem> getOrdersById(Integer id) {
        return orderItemRepository.findById(id);
    }

    public OrderItem createOrder(OrderItem orders) {
        return orderItemRepository.save(orders);
    }

    public OrderItem saveOrder(OrderItem orders) {
        return orderItemRepository.save(orders);
    }

    public void deleteOrder(Integer id) {
        orderItemRepository.deleteById(id);
    }
}
