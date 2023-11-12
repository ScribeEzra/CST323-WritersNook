package com.christamoncrief;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.christamoncrief")
public class Cst323Application {

	public static void main(String[] args) {
		SpringApplication.run(Cst323Application.class, args);
	}

}
