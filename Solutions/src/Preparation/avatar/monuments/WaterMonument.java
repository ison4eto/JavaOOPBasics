package Preparation.avatar.monuments;

public class WaterMonument extends Monument{
    private int waterAffinity;

    public WaterMonument(String name, int waterAffinity) {
        super(name);
        this.waterAffinity = waterAffinity;
    }

    public int getWaterAffinity() {
        return waterAffinity;
    }

    void setWaterAffinity(int waterAffinity) {
        this.waterAffinity = waterAffinity;
    }

    @Override
    public String toString() {
        return String.format("###Fire %s, Water Affinity: %d",super.toString(),this.waterAffinity);
    }
}
