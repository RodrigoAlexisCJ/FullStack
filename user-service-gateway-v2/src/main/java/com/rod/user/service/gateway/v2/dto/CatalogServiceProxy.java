package com.rod.user.service.gateway.v2.dto;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "catalog-service")
public interface CatalogServiceProxy {
	
	@GetMapping(value = "/orders/{category}")
	public List<OrderDTO> getCurrency(@PathVariable String category);

}
