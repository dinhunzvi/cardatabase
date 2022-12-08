package com.example.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {

    // fetch cars by brand
    List<Car> findByBrand( String brand );

    // fetch cars by color
    List<Car> findByColor( String color );

    // fetch cars by year
    List<Car> findByManufacturedYear( int year );

    // fetch cars by brand and model
    List<Car> findCarByBrandAndModel( String brand, String model );

    // fetch cars by brand or color
    List<Car> findCarByBrandOrColor( String brand, String color );
}
