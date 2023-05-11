package com.astro.cardapio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.astro.cardapio.entities.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
