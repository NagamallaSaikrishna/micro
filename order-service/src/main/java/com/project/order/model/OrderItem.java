package com.project.order.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class OrderItem {

    @Id
    @GeneratedValue
    private String productCode;
    private String productName;
    private Integer quantity;


}
