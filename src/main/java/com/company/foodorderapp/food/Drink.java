package com.company.foodorderapp.food;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class Drink extends Product implements Serializable {
    private static final long serialVersionUID = 8539936152170847419L;

    private String size;
}
