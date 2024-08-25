package com.example.demo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table(name = "pizzas")

public class Pizza {
	
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;

	@Column(name = "name", nullable = false)

	private String name;

	private String description;

	@Column(name = "price", nullable = false)

	private double price;

	private LocalDateTime udatedAt;

//getters e setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDateTime getUdatedAt() {
		return udatedAt;
	}

	public void setUdatedAt(LocalDateTime udatedAt) {
		this.udatedAt = udatedAt;
	}

}
