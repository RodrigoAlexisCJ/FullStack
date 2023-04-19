package com.rod.catalog.service.gateway.v2.model;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class DemoData {

	@Autowired
	private OrderRepository repository;
	
	@EventListener
	public void appReady(ApplicationReadyEvent event) {
		if (repository.count() == 0) {
			System.out.println("Saving demo data..........");
			repository.saveAll(Stream.of(
                    new Order("mobile", "electronics", "white", 20000),
                    new Order("T-Shirt", "clothes", "black", 999),
                    new Order("Jeans", "clothes", "blue", 1999),
                    new Order("Laptop", "electronics", "gray", 50000),
                    new Order("digital watch", "electronics", "black", 2500),
                    new Order("Fan", "electronics", "black", 50000)
            ).
            collect(Collectors.toList()));
//			repository.save(new Order("mobile", "electronics", "white", 20000));
		}
	}
}