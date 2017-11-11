package Preparation.NeedForSpeed;

import Preparation.NeedForSpeed.Car.Car;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private List<Car> parkedCars;

    public Garage() {
        this.parkedCars = new ArrayList<>();
    }

    public Garage(List<Car> parkedCars) {
        this.parkedCars = parkedCars;
    }
}
