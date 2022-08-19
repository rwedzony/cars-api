package com.cars.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Car {
    private String brand;
    private String model;
    private Integer engineCapacity;
    private LocalDate productionYear;
}
