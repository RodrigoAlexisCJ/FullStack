package com.rod.catalog.service.gateway.v2.model;

@SuppressWarnings("serial")
public class OrderNotFoundException extends RuntimeException{
	
	public OrderNotFoundException(String message) {
		super(message);
	}

}
