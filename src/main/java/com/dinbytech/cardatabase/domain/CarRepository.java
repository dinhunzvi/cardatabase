package com.dinbytech.cardatabase.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {
    // fetch cars by brand and model
    List<Car> findByBrandAndModel(String brand, String model);
    // fetch cars by brand or color
    List<Car> findByBrandOrColor(String brand, String color);
    // fetch cars by brand and sort by year
    List<Car> findByBrandOrderByYearmanufactureAsc(String brand);
    // fetch cars by brand using SQL
    @Query("select c from Car c where c.brand = ?1")
    List<Car> findByBrand(String brand);
    // fetch cars by brand using SQL
    @Query("select c from Car c where c.brand like %?1")
    List<Car> findByBrandEndsWith(String brand);

}
