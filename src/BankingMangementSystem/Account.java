package BankingMangementSystem;

import java.util.ArrayList;

public abstract class Account {

    protected int accountNumber;
    protected String accountHolder;
    protected double balance;

    protected ArrayList<String> transactions = new ArrayList<>();

    public Account(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add("Deposited: ₹" + amount);
    }

    public abstract void withdraw(double amount);

    public void checkBalance() {
        System.out.println("Balance: ₹" + balance);
    }

    public void showTransactions() {
        System.out.println("Transaction History:");
        for (String t : transactions) {
            System.out.println(t);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return "Account No: " + accountNumber +
                ", Name: " + accountHolder +
                ", Balance: ₹" + balance;
    }
}