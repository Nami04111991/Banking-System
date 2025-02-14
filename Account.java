package com.training.week1;

public abstract class Account {

    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    // Constructor to initialize account details
    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Abstract method to display account information
    public abstract void displayAccountInfo();

    // Interface Transaction
    interface Transaction {

        void deposit(double amount);  // Method to deposit an amount

        void withdraw(double amount); // Method to withdraw an amount

        // Main class
        public class AccountingTransactions {

            public static void main(String[] args) {
                // Create a SavingsAccount object
                SavingsAccount savingsAccount = new SavingsAccount("SAV 001", "Nami", 1000.0, 2.5);
                savingsAccount.displayAccountInfo();
                savingsAccount.deposit(200.0);
                savingsAccount.withdraw(150.0);

                System.out.println("\n\n");

                // Create a CheckingAccount object
                CheckingAccount checkingAccount = new CheckingAccount("CHK 001", "Wenieh", 1000.0, 100);
                checkingAccount.displayAccountInfo();
                checkingAccount.deposit(300.0);
                checkingAccount.withdraw(700.0);
                checkingAccount.withdraw(1000.0);
            }

        }
    }
}
