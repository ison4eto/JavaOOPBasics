package Encapsulation.exercise.p04_shopping_spree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<String> bought;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.bought = new ArrayList<>();
    }

    private void setName(String name) {
        if(name==null || name.trim().equals("")){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if(money<0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    String getName() {
        return name;
    }

    double getMoney() {
        return money;
    }

    List<String> getBought() {
        return bought;
    }

    boolean buy(Product p){
        try{
            this.setMoney(this.money-p.getCost());
            return true;
        }catch (IllegalArgumentException ex){
            return false;
        }
    }
}
