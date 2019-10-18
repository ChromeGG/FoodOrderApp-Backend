package com.company.foodorderapp;

import com.company.foodorderapp.services.DatabaseFillService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FoodOrderAppApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(FoodOrderAppApplication.class, args);

        DatabaseFillService dataFill = new DatabaseFillService();
        dataFill.setRepositories(ctx);

        dataFill.fillDatabase();
    }
}
