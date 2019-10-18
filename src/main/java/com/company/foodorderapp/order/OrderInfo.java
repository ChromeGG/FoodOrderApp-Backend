package com.company.foodorderapp.order;

import com.company.foodorderapp.food.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.util.List;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderInfo {

    List<Product> products;
    String description;
    Double value;
}
