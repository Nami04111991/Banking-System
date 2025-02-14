package com.training.week1;

public class CheckingAccount extends Account implements Transaction {

    private double checkingLimit;

    // Constructor to initialize checking account details
    public CheckingAccount(String accountNumber, String accountHolder, double balance, double CheckingLimit) {
        super(accountNumber, accountHolder, balance);
        this.checkingLimit = CheckingLimit;
    }

    // Implementing abstract method from Account
    @Override
    public void displayAccountInfo() {
        System.out.println("================================");
        System.out.println("== Checking Account Details:  ==");
        System.out.println("================================");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("Checking Limit: $" + checkingLimit);
    }

    // Implementing deposit method from Transaction interface
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " to Checking Account. New Balance: $" + balance);
    }

    // Implementing withdraw method from Transaction interface
    @Override
    public void withdraw(double amount) {
        if (balance + checkingLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Checking Account.");
            System.out.println("New Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds, including Checking Limit.");
        }
    }
}