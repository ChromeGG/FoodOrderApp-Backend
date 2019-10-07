package com.company.foodorderapp.controller.foodController;

import com.company.foodorderapp.food.Drink;
import com.company.foodorderapp.repository.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/api/food/drinks")
public class DrinkControllerRest {

    private DrinkRepository repo;

    @Autowired
    public DrinkControllerRest(DrinkRepository repo) {
        this.repo = repo;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Drink> getBurgers(@RequestParam(defaultValue = "name") String orderBy) {
        List<Drink> drinks = repo.findAll();
        if ("name".equals(orderBy)) {
            drinks.sort(Comparator.comparing(Drink::getPrice));
        }
        return drinks;
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Drink> getBurger(@PathVariable Long id) {
        return repo.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
