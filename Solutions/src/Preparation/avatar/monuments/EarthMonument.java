package Preparation.avatar.monuments;

public class EarthMonument extends Monument{
    private int earthAffinity;

    public EarthMonument(String name, int earthAffinity) {
        super(name);
        this.earthAffinity = earthAffinity;
    }

    public int getEarthAffinity() {
        return earthAffinity;
    }

    void setEarthAffinity(int earthAffinity) {
        this.earthAffinity = earthAffinity;
    }
    @Override
    public String toString() {
        return String.format("###Fire %s, Earth Affinity: %d",super.toString(),this.earthAffinity);
    }
}
