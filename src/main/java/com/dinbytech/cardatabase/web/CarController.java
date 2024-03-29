package com.dinbytech.cardatabase.web;

import com.dinbytech.cardatabase.domain.Car;
import com.dinbytech.cardatabase.domain.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    private CarRepository carRepository;

    @RequestMapping("/cars")
    public Iterable<Car> getCars() {
        // fetch and return cars
        return carRepository.findAll();
    }

}
