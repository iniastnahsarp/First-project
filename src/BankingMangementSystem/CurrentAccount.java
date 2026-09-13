package BankingMangementSystem;

public class CurrentAccount extends Account {

    public CurrentAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    public void withdraw(double amount) {

        if (balance - amount < -5000) {
            System.out.println("Overdraft Limit Exceeded!");
        } else {
            balance -= amount;
            transactions.add("Withdrawn: ₹" + amount);
        }
    }
}
