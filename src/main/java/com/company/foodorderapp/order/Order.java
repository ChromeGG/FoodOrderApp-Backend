package com.company.foodorderapp.order;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@Table(name = "orders")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    OrderInfo orderInfo;

//    @OneToOne
//    CustomerAddress address;
//    @OneToOne
//    CustomerInfo customerInfo;
}
