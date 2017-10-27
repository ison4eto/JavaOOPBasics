package DefeningClasses.p02_person;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer,BankAccount> accounts = new HashMap<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] inputTokens = command.split("\\s+");
            switch (inputTokens[0]) {
                case "Create":
                    execCreate();
                    break;
                case "Deposit":
                    execDeposit(Integer.parseInt(inputTokens[1]), Double.parseDouble(inputTokens[2]));
                    break;
                case "SetInterest":
                    execSetInterest(Double.parseDouble(inputTokens[1]));
                    break;
                case "GetInterest":
                    execGetInterest(Integer.parseInt(inputTokens[1]), Integer.parseInt(inputTokens[2]));
                    break;

            }
            command = scanner.nextLine();
        }
    }

    private static void execGetInterest(int id, int years) {
        BankAccount account = accounts.get(id);
        if(account==null){
            System.out.println("Account does not exist");
        }else{
            System.out.printf("%.2f%n", account.getInterest(years));
        }
    }

    private static void execSetInterest(double interest) {
        BankAccount.setRate(interest);
    }

    private static void execDeposit(int id, double amount) {
        BankAccount account = accounts.get(id);
        if(account==null){
            System.out.println("Account does not exist");
        }else{
            account.deposit(amount);
            System.out.printf("Deposited %.0f to %s%n", amount, account);
        }

    }

    private static void execCreate() {
            BankAccount account = new BankAccount();
            accounts.put(account.getId(), account);
            System.out.printf("Account %s created%n", account);

    }
}
