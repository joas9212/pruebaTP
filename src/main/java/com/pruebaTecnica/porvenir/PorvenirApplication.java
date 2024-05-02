package com.pruebaTecnica.porvenir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication 
@EntityScan("com.pruebaTecnica.porvenir.*")   
@EnableJpaRepositories("com.pruebaTecnica.porvenir.*")
public class PorvenirApplication {

	public static void main(String[] args) {
		SpringApplication.run(PorvenirApplication.class, args);
	}

}
