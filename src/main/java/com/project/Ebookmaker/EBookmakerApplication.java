package com.project.Ebookmaker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class EBookmakerApplication {
	
	
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(EBookmakerApplication.class);
 
		logger.info("Application started");
		SpringApplication.run(EBookmakerApplication.class, args);
	}

}
