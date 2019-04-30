package com.infotec.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@SpringBootConfiguration
@EnableAutoConfiguration
public class HelloWorldSpringBootApp {

	public static void main(String[] args) {
		
		SpringApplication.run(HelloWorldSpringBootApp.class, args);
	}

}
