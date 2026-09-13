package BankingMangementSystem;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {

            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("1. Savings");
                    System.out.println("2. Current");

                    int type = sc.nextInt();

                    System.out.print("Account Number: ");
                    int accNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Initial Balance: ");
                    double balance = sc.nextDouble();

                    if (type == 1) {
                        bank.createAccount(
                                new SavingsAccount(accNo, name, balance));
                    } else {
                        bank.createAccount(
                                new CurrentAccount(accNo, name, balance));
                    }

                    break;

                case 2:

                    System.out.print("Account Number: ");
                    accNo = sc.nextInt();

                    Account acc = bank.findAccount(accNo);

                    if (acc != null) {

                        System.out.print("Amount: ");
                        double amount = sc.nextDouble();

                        acc.deposit(amount);

                    } else {
                        System.out.println("Account Not Found!");
                    }

                    break;

                case 3:

                    System.out.print("Account Number: ");
                    accNo = sc.nextInt();

                    acc = bank.findAccount(accNo);

                    if (acc != null) {

                        System.out.print("Amount: ");
                        double amount = sc.nextDouble();

                        acc.withdraw(amount);

                    } else {
                        System.out.println("Account Not Found!");
                    }

                    break;

                case 4:

                    System.out.print("Account Number: ");
                    accNo = sc.nextInt();

                    acc = bank.findAccount(accNo);

                    if (acc != null) {
                        acc.checkBalance();
                    } else {
                        System.out.println("Account Not Found!");
                    }

                    break;

                case 5:

                    System.out.print("Account Number: ");
                    accNo = sc.nextInt();

                    acc = bank.findAccount(accNo);

                    if (acc != null) {
                        acc.showTransactions();
                    } else {
                        System.out.println("Account Not Found!");
                    }

                    break;

                case 6:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}