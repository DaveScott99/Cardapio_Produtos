package com.astro.cardapio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.astro.cardapio.dto.FoodDTO;
import com.astro.cardapio.dto.FoodInsertDTO;
import com.astro.cardapio.services.FoodService;

@RestController
@RequestMapping(value = "food")
public class FoodController {

	@Autowired
	private FoodService foodService;
	
	@GetMapping
	public List<FoodDTO> findAll() {
		List<FoodDTO> foods = foodService.findAll();
		return foods;
	}
	
	@GetMapping("/{id}")
	public FoodDTO findById(@PathVariable Long id) {
		FoodDTO food = foodService.findById(id);
		return food;
	}
	
	@PostMapping
	public void save(@RequestBody FoodInsertDTO data) {
		foodService.save(data);
	}
	
}
