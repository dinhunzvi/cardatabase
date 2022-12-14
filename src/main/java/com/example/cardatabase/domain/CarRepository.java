package com.example.cardatabase.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * use this to change the default path for api path
@RepositoryRestResource( path="vehicles")

**/

/**
 * to include queries in API service
 */
@RepositoryRestResource
public interface CarRepository extends CrudRepository<Car, Long> {

    // fetch cars by brand
    List<Car> findByBrand( @Param( "brand" ) String brand );

    // fetch cars by color
    List<Car> findByColor( @Param( "color" ) String color );

    // fetch cars by year
    List<Car> findByManufacturedYear( int year );

    // fetch cars by brand and model
    List<Car> findCarByBrandAndModel( String brand, String model );

    // fetch cars by brand or color
    List<Car> findCarByBrandOrColor( String brand, String color );
}
