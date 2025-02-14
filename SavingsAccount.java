package com.training.week1;

public class SavingsAccount extends Account implements Transaction {

    private double interestRate;

    // Constructor to initialize savings account details
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Implementing the abstract method from Account
    @Override
    public void displayAccountInfo() {
        System.out.println("================================");
        System.out.println("==  Savings Account Details:  ==");
        System.out.println("================================");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    // Implementing deposit method from Transaction interface
    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " to Savings Account. New Balance: $" + balance);
    }

    // Implementing withdraw method from Transaction interface
    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Savings Account. New Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}