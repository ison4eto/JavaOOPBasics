package Preparation.avatar.benders;

public class EarthBender extends Bender {
    private double groundSaturation ;

    public EarthBender(String name, int power, double groundSaturation) {
        super(name, power);
        this.groundSaturation = groundSaturation;
    }

    double getGroundSaturation () {
        return groundSaturation ;
    }

    void setGroundSaturation (double groundSaturation ) {
        this.groundSaturation  = groundSaturation ;
    }
    public double calculatePower(){
        return this.groundSaturation*super.getPower();
    }

    @Override
    public String toString() {
        return String.format("###Earth %s, Ground Saturation: %.2f",super.toString(),this.groundSaturation);
    }
}
