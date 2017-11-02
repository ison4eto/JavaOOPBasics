package Encapsulation.exercise.p03_animal_farm;

public class Chicken {
    private int age;
    private String name;
    private double eggsPerDay;

    Chicken(int age, String name) {
        this.setAge(age);
        this.setName(name);
        this.setEggsPerDay();
    }

    private void setName(String name) {
        if (name == null || name.trim().equals("")) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    private void setEggsPerDay() {
        if (age < 6) {
            this.eggsPerDay = 2;
        } else if (age > 12) {
            this.eggsPerDay = 0.75;
        } else {
            this.eggsPerDay = 1;
        }
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.0f eggs per day.", name, age, eggsPerDay);
    }
}
