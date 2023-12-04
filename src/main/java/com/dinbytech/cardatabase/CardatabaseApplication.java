package com.dinbytech.cardatabase;

import com.dinbytech.cardatabase.domain.Car;
import com.dinbytech.cardatabase.domain.CarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CardatabaseApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);

	@Autowired
	private CarRepository carRepository;

	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
		logger.info("Application restarted");
	}

	@Override
	public void run(String... args) throws Exception {
		carRepository.save(new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000));
		carRepository.save(new Car("Nissan", "Leaf", "White", "SSJ-3302", 2019, 29000));
		carRepository.save(new Car("Toyota", "Prius", "Silver", "KKO-0212", 2020, 39000));

		// fetch all cars and log to console
		for( Car car : carRepository.findAll()) {
			logger.info(car.getBrand() + " " + car.getModel());
		}
	}
}
