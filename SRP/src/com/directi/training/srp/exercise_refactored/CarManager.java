package com.directi.training.srp.exercise;

import java.util.List;

public class CarManager
{

    private CarFormatter carFormatter;
    private CarRepository carRepository;
    private CarComparator carComparator;

    public CarManager() {
        this.carRepository = new CarRepository();
        this.carFormatter = new CarFormatter();
        this.carComparator = new CarComparator();
    }

    public Car getCarById(String carId) {
        return carRepository.getCarById(carId);
    }

    public String getCarsNames() {
        List<Car> cars = carRepository.getAllCars();
        return carFormatter.getCarsNames(cars);
    }

    public Car getBestCar() {
        List<Car> cars = carRepository.getAllCars();
        return carComparator.getBestCar(cars);
    }
    
}
