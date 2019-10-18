package com.company.foodorderapp.order;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    OrderInfo orderInfo;
    @Embedded
    CustomerAddress address;
    @Embedded
    CustomerInfo customerInfo;
}
