package com.rod.user.service.gateway.v2.dto;

import java.util.Objects;

public class OrderDTO {

	private int id;
	private String name;
	private String category;
	private String color;
	private double price;
	
	public OrderDTO() {}
	
	public OrderDTO(int id, String name, String category, String color, double price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.color = color;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, color, id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderDTO other = (OrderDTO) obj;
		return Objects.equals(category, other.category) && Objects.equals(color, other.color) && id == other.id
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	@Override
	public String toString() {
		return "OrderDTO [id=" + id + ", name=" + name + ", category=" + category + ", color=" + color + ", price="
				+ price + "]";
	}
	
}