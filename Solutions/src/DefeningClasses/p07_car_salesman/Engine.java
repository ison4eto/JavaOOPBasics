package DefeningClasses.p07_car_salesman;

public class Engine {
    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement = -1;
        this.efficiency = "n/a";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append(" ")
                .append(this.model)
                .append(":\n")
                .append("  Power: ")
                .append(this.power)
                .append(System.lineSeparator());
        if(this.displacement!=-1){
            sb.append("  Displacement: ")
                    .append(this.displacement)
                    .append(System.lineSeparator());
        }else{
            sb.append("  Displacement: n/a\n");
        }
        sb.append("  Efficiency: ")
                .append(this.efficiency)
                .append(System.lineSeparator());
        return sb.toString();
    }
}
