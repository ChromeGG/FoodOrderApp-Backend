package com.company.foodorderapp.repository;

import com.company.foodorderapp.food.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DessertRepository extends JpaRepository<Drink, Long> {
}
