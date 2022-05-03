package com.dio.agendatelefonica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Projectonefeign2Application {

	public static void main(String[] args) {
		SpringApplication.run(Projectonefeign2Application.class, args);
	}

}
