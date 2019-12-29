package com.kryten.springit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
		System.out.println("Message #1 - On Master Branch.");
		System.out.println("Message #2 - On Master Branch.");
		System.out.println("Message #3 - On Master Branch.");
		System.out.println("Message #3 - On Master Branch.");

	}

}