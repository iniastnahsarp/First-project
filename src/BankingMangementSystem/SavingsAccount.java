package BankingMangementSystem;

public class SavingsAccount extends Account {

    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (amount > balance) {
            System.out.println("Insufficient Balance!");
        } else {
            balance -= amount;
            transactions.add("Withdrawn: ₹" + amount);
        }
    }
}