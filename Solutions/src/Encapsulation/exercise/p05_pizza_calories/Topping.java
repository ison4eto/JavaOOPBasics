package Encapsulation.exercise.p05_pizza_calories;

import java.util.HashMap;
import java.util.Map;

class Topping {
    private String name;
    private int weight;

    public Topping(String name, int weight) {
        this.setName(name);
        this.setWeight(weight);
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        switch (name) {
            case "Meat":
            case "Veggies":
            case "Cheese":
            case "Sauce":
                this.name = name;
                break;
            default:
                throw new IllegalArgumentException("Cannot place "+name+" on top of your pizza.");
        }
    }

    private int getWeight() {
        return weight;
    }

    private void setWeight(int weight) {
        if(weight<1 || weight>50){
            throw new IllegalArgumentException(name+"weight should be in the range [1..50].");
        }
        this.weight = weight;
    }
    double getCalories(){
        Map<String,Double> modifiers = new HashMap<>(

        );
        modifiers.put("Meat",1.2);
        modifiers.put("Veggies",0.8);
        modifiers.put("Cheese",1.1);
        modifiers.put("Sauce",0.9);
        return 2*this.weight*modifiers.get(this.name);
    }
}
