package Preparation.avatar.benders;

public class AirBender extends Bender {
    private double aerialIntegirty;

    public AirBender(String name, int power, double aerialIntegirty) {
        super(name, power);
        this.aerialIntegirty = aerialIntegirty;
    }

    double getAerialIntegirty() {
        return aerialIntegirty;
    }

    void setAerialIntegirty(double aerialIntegirty) {
        this.aerialIntegirty = aerialIntegirty;
    }
    public double calculatePower(){
        return this.aerialIntegirty*super.getPower();
    }
    @Override
    public String toString() {
        return String.format("###Air %s, Aerial Integrity: %.2f",super.toString(),this.aerialIntegirty);
    }

}
