package Preparation.avatar.monuments;

public class FireMonument extends Monument{
    private int fireAffinity;

    public FireMonument(String name, int fireAffinity) {
        super(name);
        this.fireAffinity = fireAffinity;
    }

    public int getFireAffinity() {
        return fireAffinity;
    }

    void setFireAffinity(int fireAffinity) {
        this.fireAffinity = fireAffinity;
    }
    @Override
    public String toString() {
        return String.format("###Fire %s, Fire Affinity: %d",super.toString(),this.fireAffinity);
    }
}
