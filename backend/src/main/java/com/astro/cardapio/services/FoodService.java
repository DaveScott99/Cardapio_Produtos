package com.astro.cardapio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.astro.cardapio.dto.FoodDTO;
import com.astro.cardapio.dto.FoodInsertDTO;
import com.astro.cardapio.entities.Food;
import com.astro.cardapio.repositories.FoodRepository;

@Service
public class FoodService {

	@Autowired
	private FoodRepository foodRepository;
	
	@Transactional(readOnly = true)
	public List<FoodDTO> findAll(){
		List<Food> foods = foodRepository.findAll();
		return foods.stream().map(x -> new FoodDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public FoodDTO findById(Long id) {
		Food food = foodRepository.findById(id).get();
		return new FoodDTO(food);
	}
	
	public void save(FoodInsertDTO data ) {
		Food food = new Food(data);
		foodRepository.save(food);
	}
	
}
