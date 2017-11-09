package Preparation.avatar.benders;

abstract class Bender {
    private String name;
    private int power;

    Bender(String name, int power) {
        this.name = name;
        this.power = power;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getPower() {
        return power;
    }

    void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("Bender: %s, Power: %d",this.name,this.power);
    }
}
