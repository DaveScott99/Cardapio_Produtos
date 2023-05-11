package com.astro.cardapio.entities;

import java.util.Objects;

import com.astro.cardapio.dto.FoodInsertDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_food")
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String imgUrl;
	private Double price;
	
	public Food() {
	}
	
	public Food(Long id, String title, String imgUrl, Double price) {
		this.id = id;
		this.title = title;
		this.imgUrl = imgUrl;
		this.price = price;
	}
	
	public Food(FoodInsertDTO dto) {
		title = dto.getTitle();
		imgUrl = dto.getImgUrl();
		price = dto.getPrice();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return Objects.equals(id, other.id);
	}
	
}
