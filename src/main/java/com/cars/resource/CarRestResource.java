package com.cars.resource;

import com.cars.model.Car;
import com.cars.service.CarService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

@Path("/car")
public class CarRestResource {

    @Inject
    CarService service;

    @GET
    public List<Car> getAllCars() {
        return service.getAllCars();
    }

    @GET
    @Path("/{id}")
    public Car getCar(@PathParam("id") String id) {
        return service.getCar(Integer.valueOf(id));
    }
}
