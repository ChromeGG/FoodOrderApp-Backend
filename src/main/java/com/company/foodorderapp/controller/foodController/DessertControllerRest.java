package com.company.foodorderapp.controller.foodController;

import com.company.foodorderapp.food.Burger;
import com.company.foodorderapp.food.Drink;
import com.company.foodorderapp.repository.BurgerRepository;
import com.company.foodorderapp.repository.DessertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/api/food/desserts")
public class DessertControllerRest {

    private DessertRepository dessertRepo;

    @Autowired
    public DessertControllerRest(DessertRepository dessertRepo) {
        this.dessertRepo = dessertRepo;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Drink> getBurgers(@RequestParam(defaultValue = "name") String orderBy) {
        List<Drink> drinks = dessertRepo.findAll();
        if ("name".equals(orderBy)) {
            drinks.sort(Comparator.comparing(Drink::getPrice));
        }
        return drinks;
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Drink> getBurger(@PathVariable Long id) {
        return dessertRepo.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
