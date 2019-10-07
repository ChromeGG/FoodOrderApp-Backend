package com.company.foodorderapp.controller.foodController;

import com.company.foodorderapp.food.Burger;
import com.company.foodorderapp.repository.BurgerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/api/food/burgers")
public class BurgerControllerRest {

    private BurgerRepository burgerRepo;

    @Autowired
    public BurgerControllerRest(BurgerRepository burgerRepository) {
        this.burgerRepo = burgerRepository;
    }


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Burger> getBurgers(@RequestParam(defaultValue = "name") String orderBy) {
        List<Burger> burgers = burgerRepo.findAll();
        if ("name".equals(orderBy)) {
            burgers.sort(Comparator.comparing(Burger::getPrice));
        }
        return burgers;
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Burger> getBurger(@PathVariable Long id) {
        return burgerRepo.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
