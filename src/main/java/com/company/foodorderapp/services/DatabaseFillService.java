package com.company.foodorderapp.services;

import com.company.foodorderapp.food.Burger;
import com.company.foodorderapp.food.Dessert;
import com.company.foodorderapp.food.Drink;
import com.company.foodorderapp.repository.BurgerRepository;
import com.company.foodorderapp.repository.DessertRepository;
import com.company.foodorderapp.repository.DrinkRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public class DatabaseFillService {

    private ConfigurableApplicationContext ctx;
    private BurgerRepository burgerRepo;
    private DrinkRepository drinkRepo;
    private DessertRepository dessertRepo;

    public void fillDatabase() {
        insertBurgers();
        insertDrinks();
        insertDesserts();
    }

    private void insertDesserts() {
        List<Dessert> dessertsToSave = new ArrayList<>();

        Dessert dessert1 = new Dessert("Lody", "Czekoladowe, truskawkowe, śmietankowe", 6.00, "3 Gałki");
        Dessert dessert2 = new Dessert("Gofr", "Banan, sos czekoladowy, bita śmietana", 8.00, "200 g");
        Dessert dessert3 = new Dessert("Kisiel", "Gęsty, kisiel prosto z paczki", 3.00, "500 g");
        Dessert dessert4 = new Dessert("Jabłecznik", "Kawałek jabłecznika własnego wyrobu", 4.00, "50 g");
        Dessert dessert5 = new Dessert("Budyń", "Budyń robiony ręcznie", 4.00, "350 g");

        dessertsToSave.add(dessert1);
        dessertsToSave.add(dessert2);
        dessertsToSave.add(dessert3);
        dessertsToSave.add(dessert4);
        dessertsToSave.add(dessert5);

        dessertRepo.saveAll(dessertsToSave);
    }

    private void insertDrinks() {
        List<Drink> drinksToSave = new ArrayList<>();

        Drink drink1 = new Drink("Woda Niegazowana", "Piwniczanka Zdrój, liść mięty, cytryna", 4.00, "0.5L");
        Drink drink2 = new Drink("Woda Gaz", "Polaris Zdrój, liść mięty, cytryna", 5.00, "0.5L");
        Drink drink3 = new Drink("CocaCola", "Klasyczna cocacola, lodówka", 7.00, "1L");
        Drink drink4 = new Drink("Sprite", "Sprite, lodówka", 6.00, "1L");
        Drink drink5 = new Drink("Kawa", "Siekiera, 95% kofeiny", 4.00, "0.25L");
        Drink drink6 = new Drink("Koktajl", "Cebula, ser, żółć", 6.00, "0.4L");

        drinksToSave.add(drink1);
        drinksToSave.add(drink2);
        drinksToSave.add(drink3);
        drinksToSave.add(drink4);
        drinksToSave.add(drink5);

        drinkRepo.saveAll(drinksToSave);

    }

    private void insertBurgers() {
        List<Burger> burgersToSave = new ArrayList<>();

        Burger burger1 = new Burger("Classic", "bułka, mięso wołowe 180g, sosy, warzywa", 17.00, false, "Średni");
        Burger burger2 = new Burger("Mexicano", "bułka, mięso wołowe 180g, warzywa, sos serowy, papryczki jalapeno, nachosy", 20.00, false, "Duży");
        Burger burger3 = new Burger("Wegetariański", "bułka, sosy, warzywa, trawa", 12.00, true, "Mały");
        Burger burger4 = new Burger("Góral", "bułka, mięso wołowe 180g, sosy, warzywa, oscypek, żurawina", 22.00, false, "Duży");
        Burger burger5 = new Burger("Serowy", "bułka, 4 sery, sosy", 14.00, true, "Średni");

        burgersToSave.add(burger1);
        burgersToSave.add(burger2);
        burgersToSave.add(burger3);
        burgersToSave.add(burger4);
        burgersToSave.add(burger5);

        burgerRepo.saveAll(burgersToSave);
    }

    public void setRepositories(ConfigurableApplicationContext ctx) {
        this.burgerRepo = ctx.getBean(BurgerRepository.class);
        this.drinkRepo = ctx.getBean(DrinkRepository.class);
        this.dessertRepo = ctx.getBean(DessertRepository.class);
    }
}
