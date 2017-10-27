package DefeningClasses.p02_person;

public class BankAccount {
    private static final double DEFAULT_INTEREST = 0.02;

    private static double rate = DEFAULT_INTEREST;
    private static int bankAccountCount;

    private int id;
    private double balance;

    public BankAccount() {
        this.id = ++bankAccountCount;
    }

    public double getBalance() {
        return balance;
    }

    public static double getRate() {
        return rate;
    }

    public static int getBankAccountCount() {
        return bankAccountCount;
    }

    public static void setBankAccountCount(int bankAccountCount) {
        BankAccount.bankAccountCount = bankAccountCount;
    }

    public static double getDefaultInterest() {
        return DEFAULT_INTEREST;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setRate(double interest) {
        rate = interest;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public double getInterest(int years) {
        return this.balance * rate * years;
    }

    @Override
    public String toString() {
        return "ID" + this.id;
    }
}
