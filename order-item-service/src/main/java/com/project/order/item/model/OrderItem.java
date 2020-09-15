package com.project.order.item.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class OrderItem {

    @Id
    @GeneratedValue
    private Integer productCode;
    private String productName;
    private Integer quantity;


}
