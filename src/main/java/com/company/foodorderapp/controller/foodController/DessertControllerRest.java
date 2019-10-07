package com.company.foodorderapp.controller.foodController;

import com.company.foodorderapp.food.Dessert;
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
    public List<Dessert> getBurgers(@RequestParam(defaultValue = "name") String orderBy) {
        List<Dessert> desserts = dessertRepo.findAll();
        if ("name".equals(orderBy)) {
            desserts.sort(Comparator.comparing(Dessert::getPrice));
        }
        return desserts;
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Dessert> getBurger(@PathVariable Long id) {
        return dessertRepo.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
