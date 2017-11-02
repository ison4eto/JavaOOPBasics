package Encapsulation.exercise.p05_pizza_calories;

import java.util.HashMap;
import java.util.Map;

class Dough {
    private String type;
    private String addition;
    private int weight;

    Dough() {
    }

    Dough(String type, int weight) {
        this.setType(type);
        this.addition = null;
        this.setWeight(weight);
    }

    Dough(String type, String addition, int weight) {
        this.setType(type);
        this.setAddition(addition);
        this.setWeight(weight);
    }

    private String getType() {
        return type;
    }

    private void setType(String type) {
        switch (type) {
            case "White":
            case "Wholegrain":
                this.type = type;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }

    }

    private String getAddition() {
        return addition;
    }

    private void setAddition(String addition) {
        switch (addition) {
            case "Crispy":
            case "Chewy":
            case "Homemade":
                this.addition = addition;
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private int getWeight() {
        return weight;
    }

    private void setWeight(int weight) {
        if(weight<1 || weight>200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }
    double getCalories(){
        Map<String,Double> modifiers = new HashMap<>(

        );
        modifiers.put("White",1.5);
        modifiers.put("Wholegrain",1.0);
        modifiers.put("Crispy",0.9);
        modifiers.put("Chewy",1.1);
        modifiers.put("Homemade",1.0);
        if(addition == null){
            return 2*this.weight*modifiers.get(type);
        }
        return 2*this.weight*modifiers.get(type)*modifiers.get(addition);
    }
}
