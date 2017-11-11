package Preparation.NeedForSpeed.Car;

import Preparation.NeedForSpeed.Car.Car;

public class SlowCar extends Car {
    private int stars;

    protected SlowCar(String brand, String model, int yearOfProduction, int horsePower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, horsePower, acceleration, suspension, durability);
        this.stars = 0;
    }

    @Override
    public String toString() {
        return super.toString()+this.stars+" *";
    }
}
