package Encapsulation.lab;

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    Person(String firstName, String lastName, int age, double salary) {
        this(firstName,lastName,age);
        this.salary = salary;
    }

    String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    double getSalary() {
        return salary;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }
    void increaseSalary(int bonus){
        if(this.age<30){
            bonus/=2;
        }
        this.salary += this.salary*bonus/100;
    }

    @Override
    public String toString() {
        //return String.format("%s %s is %d years old.",this.firstName,this.lastName,this.age);
        return String.format("%s %s gets %s leva",this.firstName,this.lastName,this.salary);
    }
}
