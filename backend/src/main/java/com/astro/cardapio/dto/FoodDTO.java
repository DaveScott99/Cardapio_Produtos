package com.astro.cardapio.dto;

import com.astro.cardapio.entities.Food;

public class FoodDTO {

	private Long id;
	private String title;
	private String imgUrl;
	private Double price;
	
	public FoodDTO(Food entity) {
		
		id = entity.getId();
		title = entity.getTitle();
		imgUrl = entity.getImgUrl();
		price = entity.getPrice();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public Double getPrice() {
		return price;
	}
	
}
