package DefeningClasses.p02_person;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<BankAccount> accounts;

    public Person(String name, int age, List<BankAccount> accounts) {
        this.name = name;
        this.age = age;
        this.accounts = accounts;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.accounts = new ArrayList<>();
    }

    public Person() {
        this.accounts = new ArrayList<>();
    }

    public double getBalance(){
        return this.accounts.stream().mapToDouble(BankAccount::getBalance).sum();
    }
}
