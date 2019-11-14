package com.jpa.demosample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemosampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemosampleApplication.class, args);
		System.out.println("Testing this");
	}
}
