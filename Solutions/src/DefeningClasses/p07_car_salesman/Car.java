package DefeningClasses.p07_car_salesman;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.color = "n/a";
        this.weight = -1;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append(this.model)
                .append(":\n")
                .append(engine.toString());
        if(this.weight==-1){
            sb.append(" Weight: n/a\n");
        }else{
            sb.append(" Weight: ")
                    .append(this.weight)
                    .append(System.lineSeparator());
        }
        sb.append(" Color: ")
                .append(this.color)
                .append(System.lineSeparator());
        return sb.toString();
    }
}
