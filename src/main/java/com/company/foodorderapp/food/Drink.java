package com.company.foodorderapp.food;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Drink extends Product implements Serializable {
    private static final long serialVersionUID = 8539936152170847419L;

    public Drink(String name, String description, Double price, String size) {
        super(name, description, price);
        this.size = size;
    }

    //    public Burger(String name, String description, Double price, Boolean isVegan, String size) {
//        super(name, description, price);
//        this.isVegan = isVegan;
//        this.size = size;
//    }

    private String size;
}
