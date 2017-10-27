package DefeningClasses.p01_bank_account;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer,BankAccount> accounts = new HashMap<>();
        Scanner scanner =  new Scanner(System.in);
        String command = scanner.nextLine();
        while (!command.equals("End")){
            String[] inputTokens = command.split("\\s+");
            switch (inputTokens[0]){
                case "Create":
                    execCreate(inputTokens,accounts);
                    break;
                case "Deposit":
                    execDeposit(inputTokens,accounts);
                    break;
                case "Withdraw":
                    execWithdraw(inputTokens,accounts);
                    break;
                case "Print":
                    execPrint(inputTokens,accounts);
                    break;

            }
            command = scanner.nextLine();
        }
    }

    private static void execPrint(String[] inputTokens, Map<Integer, BankAccount> accounts) {
        int id = Integer.valueOf(inputTokens[1]);
        if(!accounts.containsKey(id)){
            System.out.println("Account does not exist");
        }else {
            System.out.printf("Account %s, balance %.2f\n",accounts.get(id),accounts.get(id).getBalance());
        }
    }

    private static void execWithdraw(String[] inputTokens, Map<Integer, BankAccount> accounts) {
        int id = Integer.valueOf(inputTokens[1]);
        if(!accounts.containsKey(id)){
            System.out.println("Account does not exist");
        }else {
            accounts.get(id).withdraw(Integer.valueOf(inputTokens[2]));
        }
    }

    private static void execDeposit(String[] inputTokens, Map<Integer, BankAccount> accounts) {
        int id = Integer.valueOf(inputTokens[1]);
        if(!accounts.containsKey(id)){
            System.out.println("Account does not exist");
        }else {
            accounts.get(id).deposit(Integer.valueOf(inputTokens[2]));
        }

    }

    private static void execCreate(String[] inputTokens, Map<Integer, BankAccount> accounts) {
        int id = Integer.valueOf(inputTokens[1]);
        if(accounts.containsKey(id)){
            System.out.println("Account already exists");
        }else{
            BankAccount bankAccount = new BankAccount();
            bankAccount.setId(id);
            accounts.put(id,bankAccount);
        }
    }
}
