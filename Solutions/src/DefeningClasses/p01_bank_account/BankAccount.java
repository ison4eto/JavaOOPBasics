package DefeningClasses.p01_bank_account;

public class BankAccount {
    private int id;
    private double balance;



    @Override
    public String toString() {
        return "ID" + this.getId();
    }

    void withdraw(double amount) {
        if (amount < 0 || balance - amount < 0) {
            System.out.println("Insufficient balance");
            return;
        }
        this.balance -= amount;
    }

    void deposit(double amount) {
        if (amount < 0) {
            return;
        }
        this.balance += amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}