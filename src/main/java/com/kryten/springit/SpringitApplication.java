package com.kryten.springit;
import com.kryten.springit.config.SpringitProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;


@SpringBootApplication
@EnableConfigurationProperties(SpringitProperties.class)
public class SpringitApplication {

	@Autowired
	private SpringitProperties springitProperties;

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}

	@Profile("devOnly")
	@Bean
	CommandLineRunner runner() {
		return args -> {
			System.out.println("Welcome message: " + "Some junk" + springitProperties.getWelcomeMessage());
		};
	}
}