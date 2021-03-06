package com.company.foodorderapp.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerInfo {
    String name;
    String surname;
    String phoneNumber;
}
