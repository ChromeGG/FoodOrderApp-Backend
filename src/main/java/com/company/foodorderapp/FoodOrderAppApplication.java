package com.company.foodorderapp;

import com.company.foodorderapp.food.Burger;
import com.company.foodorderapp.repository.BurgerRepository;
import com.company.foodorderapp.services.DatabaseFillService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FoodOrderAppApplication {

    public static void main(String[] args) {
//        SpringApplication.run(FoodOrderAppApplication.class, args);

        ConfigurableApplicationContext ctx = SpringApplication.run(FoodOrderAppApplication.class, args);

        BurgerRepository repo = ctx.getBean(BurgerRepository.class);

        DatabaseFillService dataFill = new DatabaseFillService(repo);

        dataFill.fillDatabase();

//        Burger burger = new Burger("Krabo-burger", "chuj Ci na kurwe", 21.37, false, "Maxxx");
//
//        repo.save(burger);


    }

}
