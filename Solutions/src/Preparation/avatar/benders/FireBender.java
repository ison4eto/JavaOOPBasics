package Preparation.avatar.benders;

public class FireBender extends Bender {
    private double heatAggression ;

    public FireBender(String name, int power, double heatAggression) {
        super(name, power);
        this.heatAggression = heatAggression;
    }

    double getHeatAggression () {
        return heatAggression ;
    }

    void setHeatAggression (double heatAggression ) {
        this.heatAggression  = heatAggression ;
    }
    public double calculatePower(){
        return this.heatAggression*super.getPower();
    }

    @Override
    public String toString() {
        return String.format("###Fire %s, Heat Aggression: %.2f",super.toString(),this.heatAggression);
    }
}
