package Encapsulation.exercise.p05_pizza_calories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] pizzaTokens = reader.readLine().split("\\s+");
            Pizza pizza = new Pizza(pizzaTokens[1], Integer.parseInt(pizzaTokens[2]));
            String[] doughTokens = reader.readLine().split("\\s+");
            Dough dough;
            if (doughTokens.length == 3) {
                dough = new Dough(doughTokens[1], Integer.parseInt(doughTokens[2]));
            } else if (doughTokens.length == 4) {
                dough = new Dough(doughTokens[1], doughTokens[2], Integer.parseInt(doughTokens[3]));
            } else{
                throw new IllegalArgumentException("Error declaring dough");
            }
            pizza.setDough(dough);
            while (true){
                String[] line = reader.readLine().split("\\s+");
                if(line[0].equals("END")){
                    System.out.println(pizza);
                    break;
                }
                Topping top = new Topping(line[1],Integer.parseInt(line[2]));
                pizza.getToppings().add(top);
                pizza.setMaxCountToppings(pizza.getMaxCountToppings()+1);
            }

        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
