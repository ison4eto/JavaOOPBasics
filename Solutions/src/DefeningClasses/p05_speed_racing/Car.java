package DefeningClasses.p05_speed_racing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostPerKm;
    private int distanceTravelled;

    public Car(String model, int fuelAmount, double fuelCostPerKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKm = fuelCostPerKm;
        this.distanceTravelled = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public double getFuelCostPerKm() {
        return fuelCostPerKm;
    }

    public void setFuelCostPerKm(double fuelCostPerKm) {
        this.fuelCostPerKm = fuelCostPerKm;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d",this.model,this.fuelAmount,this.distanceTravelled);
    }

    public boolean travel(double distance){
        double maxDist = this.fuelAmount/this.fuelCostPerKm;
        if(maxDist<distance){
            return false;
        }
        double fuelUsed = distance*this.fuelCostPerKm;
        this.fuelAmount -=fuelUsed;
        this.distanceTravelled += distance;
        return true;
    }
}
