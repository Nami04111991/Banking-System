package com.training.week1;

public class Main {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("SAV 001", "Nami", 1000.0, 2.5);
        savingsAccount.displayAccountInfo();
        savingsAccount.deposit(200.0);
        // savingsAccount.withdraw(150.0);

        System.out.println("\n\n");

        // Create a CheckingAccount object
        CheckingAccount checkingAccount = new CheckingAccount("CHK 001", "Nami", 500, 100);
        checkingAccount.displayAccountInfo();
//        checkingAccount.deposit(300.0);
//       checkingAccount.withdraw(700.0);
//        checkingAccount.withdraw(1000.0);
    }

}
