package Preparation.NeedForSpeed.Car;

import java.util.ArrayList;
import java.util.List;

public class PerformanceCar extends Car {
    private List<String> addOns;

    public PerformanceCar(String brand, String model, int yearOfProduction, int horsePower, int acceleration, int suspension, int durability) {
        super(brand, model, yearOfProduction, (int) (horsePower * 1.5), acceleration, suspension, (int) (durability * 1.25));
        this.addOns = new ArrayList<>();
    }

    @Override
    protected void setHorsePower(int horsePower) {
        int increaseHorsepower = horsePower + (horsePower * 50) / 100;
        super.setHorsePower(increaseHorsepower);
    }

    @Override
    protected void setSuspension(int suspension) {
        int decreaseSuspension = suspension - (suspension * 25) / 100;
        super.setSuspension(decreaseSuspension);
    }

    @Override
    public String toString() {
        return super.toString() + "Add-ons: " +
                (this.addOns.isEmpty() ? "None" : String.join(", ", this.addOns));
    }
}
