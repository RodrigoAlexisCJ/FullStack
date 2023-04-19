package com.rod.catalog.service.gateway.v2.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	@Autowired
	private OrderRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Order>> getAll() {
		return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
	}
	
	@GetMapping(value = "/{category}")
	public ResponseEntity<List<Order>> getOrderByCategory(@PathVariable String category) {
		List<Order> order = repository.findByCategory(category);
		if (order.isEmpty()) {
			throw new OrderNotFoundException(String.format("Order not found by category = %s", category));
		} else {
			return new ResponseEntity<>(order, HttpStatus.OK);
		}
	}
	
}
