package Preparation.avatar.monuments;

public class AirMonument extends Monument{
    private int airAffinity;

    public AirMonument(String name, int airAffinity) {
        super(name);
        this.airAffinity = airAffinity;
    }

    public int getAirAffinity() {
        return airAffinity;
    }

    void setAirAffinity(int airAffinity) {
        this.airAffinity = airAffinity;
    }

    @Override
    public String toString() {
        return String.format("###Fire %s, Air Affinity: %d",super.toString(),this.airAffinity);
    }
}
