package Encapsulation.exercise.p04_shopping_spree;

class Product {
    private String name;
    private double cost;

    Product(String name, double cost) {
        this.setName(name);
        this.setCost(cost);
    }

    private void setName(String name) {
        if(name==null || name.trim().equals("")){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    double getCost() {
        return cost;
    }


    private void setCost(double cost) {
        if(cost<=0){
            throw new IllegalArgumentException("Cost cannot be negative or zero.");
        }
        this.cost = cost;
    }
}
