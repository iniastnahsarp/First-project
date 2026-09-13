package BankingMangementSystem;

import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts = new ArrayList<>();

    public void createAccount(Account account) {
        accounts.add(account);
        System.out.println("Account Created Successfully!");
    }

    public Account findAccount(int accountNumber) {

        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accountNumber) {
                return acc;
            }
        }

        return null;
    }
}