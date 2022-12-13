package com.example.edsoncabrejos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EfEdsoncabrejosEurekaServeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfEdsoncabrejosEurekaServeApplication.class, args);
	}

}
