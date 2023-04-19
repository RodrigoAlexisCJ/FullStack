package com.rod.catalog.service.gateway.v2.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_TBL")
public class Order {
	
	private @Id @GeneratedValue int id;
	private String name;
	private String category;
	private String color;
	private double price;
	
	public Order() {}
	
	public Order(int id, String name, String category, String color, double price) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.color = color;
		this.price = price;
	}
	
	public Order(String name, String category, String color, double price) {
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
		Order other = (Order) obj;
		return Objects.equals(category, other.category) && Objects.equals(color, other.color) && id == other.id
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", category=" + category + ", color=" + color + ", price=" + price
				+ "]";
	}

}