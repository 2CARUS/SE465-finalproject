package com.se465.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.se465.logic.DataHandler;

@SpringBootApplication
public class EventsApiApplication {

	public static void main(String[] args) {
		DataHandler.getInstance();
		SpringApplication.run(EventsApiApplication.class, args);
	}

}
