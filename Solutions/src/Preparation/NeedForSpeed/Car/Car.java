package Preparation.NeedForSpeed.Car;

public abstract class Car {
    private String brand;
    private String model;
    private int yearOfProduction;
    private int horsePower;
    private int acceleration;
    private int suspension;
    private int durability;

    protected Car(String brand, String model, int yearOfProduction, int horsePower, int acceleration, int suspension, int durability) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.setHorsePower(horsePower);
        this.acceleration = acceleration;
        this.setSuspension(suspension);
        this.durability = durability;
    }

    protected void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    protected void setSuspension(int suspension) {
        this.suspension = suspension;
    }

    /*
    * o	“{brand} {model} {yearOfProduction}
o	 {horsepower} HP, 100 m/h in {acceleration} s
o	 {suspension} Suspension force, {durability} Durability”
*/
    @Override
    public String toString() {

        return this.brand + " " + this.model + " " + this.yearOfProduction +
                System.lineSeparator() +
                this.horsePower + " HP, 100 m/h in " + this.acceleration +
                System.lineSeparator() +
                this.suspension + " Suspension force, " + this.durability + " Durability" +
                System.lineSeparator();
    }
}
