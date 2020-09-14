package com.project.order.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
public class Orders {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Timestamp orderDate;
    private String shippingAddress;
    private Integer total;
}
