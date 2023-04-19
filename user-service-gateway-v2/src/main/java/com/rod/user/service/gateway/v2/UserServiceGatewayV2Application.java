package com.rod.user.service.gateway.v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class UserServiceGatewayV2Application {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceGatewayV2Application.class, args);
	}

}
