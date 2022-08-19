package com.cars.resource;

import com.cars.model.Car;
import com.cars.service.CarService;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;

import javax.inject.Inject;
import java.util.List;

@GraphQLApi
@Slf4j
public class CarGraphQlResource {
    @Inject
    CarService service;

    @Query
    public List<Car> getAllCars() {
        return service.getAllCars();
    }

    @Query
    public Car getCar(@Name("carId") int id) {
        log.info("start to fetch car with id: <{}>", id);
        Car car = service.getCar(id);
        log.info("end to fetch car with id: <{}>", id);
        return car;
    }
}
