package com.misscupcake.miss_catalog;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MissCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MissCatalogApplication.class, args);
		Logger logger = Logger.getLogger("Miss Cupcake Web Service");
		logger.info("Miss Cupcake catalog has started.");
	}

}
