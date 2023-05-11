package com.astro.cardapio.dto;

import com.astro.cardapio.entities.Food;

public class FoodInsertDTO {

	private String title;
	private String imgUrl;
	private Double price;
	
	public FoodInsertDTO() {
	}
	
	public FoodInsertDTO(Food entity) {
		title = entity.getTitle();
		imgUrl = entity.getImgUrl();
		price = entity.getPrice();
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
