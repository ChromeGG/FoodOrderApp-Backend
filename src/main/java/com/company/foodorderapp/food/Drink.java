package com.company.foodorderapp.food;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Drink extends Product {

    private String size;

}
