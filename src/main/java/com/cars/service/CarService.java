package com.cars.service;

import com.cars.model.Car;
import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
@Slf4j
public class CarService {
    private List<Car> cars = new ArrayList<>();

    public CarService() {
        Car porsche = new Car("Porsche", "Cayenne", 3500, LocalDate.of(2010, Month.MAY, 5));
        Car maserati = new Car("Maserati", "Quattroporte", 5000, LocalDate.of(2007, Month.MAY, 5));
        Car volvo = new Car("Volvo", "S40", 2000, LocalDate.of(2007, Month.MAY, 5));
        Car audi = new Car("Audi", "A4", 2500, LocalDate.of(2011, Month.MAY, 5));
        Car nissan = new Car("Nissan", "GTR", 3500, LocalDate.of(2018, Month.MAY, 5));
        Car bmw = new Car("BMW", "X6", 4000, LocalDate.of(2019, Month.MAY, 5));
        Car peugeot = new Car("Peugeot", "400", 1800, LocalDate.of(1998, Month.MAY, 5));

        cars.add(porsche);
        cars.add(maserati);
        cars.add(volvo);
        cars.add(audi);
        cars.add(nissan);
        cars.add(bmw);
        cars.add(peugeot);
    }

    public Car getCar(int id){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        log.info("get car with Id: <{}>" +id);
        return cars.get(id);
    }

    public List<Car> getAllCars(){
        return cars;
    }
}
