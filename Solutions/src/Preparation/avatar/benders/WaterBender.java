package Preparation.avatar.benders;

public class WaterBender extends Bender {
    private double waterClarity;

    public WaterBender(String name, int power, double waterClarity) {
        super(name, power);
        this.waterClarity = waterClarity;
    }


    double getWaterClarity() {
        return waterClarity;
    }

    void setWaterClarity(double waterClarity) {
        this.waterClarity = waterClarity;
    }
    public double calculatePower(){
        return this.waterClarity*super.getPower();
    }

    @Override
    public String toString() {
        return String.format("###Water %s, Water Clarity: %.2f",super.toString(),this.waterClarity);
    }
}
