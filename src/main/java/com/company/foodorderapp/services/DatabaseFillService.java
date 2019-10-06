package com.company.foodorderapp.services;

import com.company.foodorderapp.food.Burger;
import com.company.foodorderapp.repository.BurgerRepository;

import java.util.ArrayList;
import java.util.List;

public class DatabaseFillService {

    private BurgerRepository repo;

    public DatabaseFillService(BurgerRepository repo) {
        this.repo = repo;
    }

    public void fillDatabase() {
        insertBurgers();
    }

    private void insertBurgers() {
        List<Burger> burgersToSave = new ArrayList<>();

        Burger burger1 = new Burger("Classic", "bułka, mięso wołowe 180g, sosy, warzywa", 17.00, false, "Średni");
        Burger burger2 = new Burger("Mexicano", "bułka, mięso wołowe 180g, warzywa, sos serowy, papryczki jalapeno, nachosy", 20.00, false, "Duży");
        Burger burger3 = new Burger("Wegetariański", "bułka, sosy, warzywa, trawa", 12.00, true, "Mały");
        Burger burger4 = new Burger("Góral", "bułka, mięso wołowe 180g, sosy, warzywa, oscypek, żurawina", 22.00, false, "Duży");
        Burger burger5 = new Burger("Serowy", "4 sery, ", 14.00, true, "Średni");

        burgersToSave.add(burger1);
        burgersToSave.add(burger2);
        burgersToSave.add(burger3);
        burgersToSave.add(burger4);
        burgersToSave.add(burger5);

        repo.saveAll(burgersToSave);
    }
}
