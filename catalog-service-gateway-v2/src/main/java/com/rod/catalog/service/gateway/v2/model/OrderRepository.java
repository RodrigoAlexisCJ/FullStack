package com.rod.catalog.service.gateway.v2.model;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
	
	public List<Order> findByCategory(String category);
	public Order findOrderById(Integer id);
	@Override public List<Order> findAll();
	
}