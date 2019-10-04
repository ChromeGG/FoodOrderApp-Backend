package com.company.foodorderapp.food;

import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
public class Burger extends Product {

    private Boolean isVegan;
    private String size;
}
