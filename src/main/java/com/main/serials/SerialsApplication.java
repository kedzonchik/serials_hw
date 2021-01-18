package com.main.serials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SerialsApplication {

	public static void main(String[] args) {
		System.out.println("Privet");
		SpringApplication.run(SerialsApplication.class, args);

	}

}
