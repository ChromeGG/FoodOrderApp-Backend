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
public class Burger extends Product implements Serializable {

    private static final long serialVersionUID = 8539936152170847419L;

    private Boolean isVegan;
    private String size;

    public Burger(String name, String description, Double price, String imageUrl, Boolean isVegan, String size) {
        super(name, description, price, imageUrl);
        this.isVegan = isVegan;
        this.size = size;
    }
}
