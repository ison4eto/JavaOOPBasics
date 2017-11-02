package Encapsulation.exercise.p05_pizza_calories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;
    private int maxCountToppings;

    Pizza(String name, int maxCountToppings) {
        this.setName(name);
        this.setMaxCountToppings(maxCountToppings);
        this.toppings = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.length() > 10 || name.trim().equals("")) {
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    void setMaxCountToppings(int count) {
        if(count<0||count>10){
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
        this.maxCountToppings = maxCountToppings;
    }

    void setDough(Dough dough) {
        this.dough = dough;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public int getMaxCountToppings() {
        return maxCountToppings;
    }

    @Override
    public String toString() {
        double toppCal = 0;
        for (Topping topping : this.toppings) {
            toppCal += topping.getCalories();
        }
        return String.format("%s - %.2f",this.name,dough.getCalories()+toppCal);
    }
}
