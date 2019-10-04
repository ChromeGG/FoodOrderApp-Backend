package com.company.foodorderapp.repository;

import com.company.foodorderapp.food.Burger;
import com.company.foodorderapp.food.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BurgerRepository extends JpaRepository<Burger, Long> {
}
