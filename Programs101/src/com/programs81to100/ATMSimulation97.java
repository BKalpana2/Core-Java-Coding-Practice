package com.programs81to100;

import java.util.Scanner;

public class ATMSimulation97 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin = 1234;
        double balance = 10000;

        System.out.print("Enter ATM PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Invalid PIN.");
            sc.close();
            return;
        }

        while (true) {

            System.out.println("\n===== ATM =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("Balance: ₹" + balance);
                    break;

                case 2:

                    System.out.print("Enter amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw > 0 && withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Please collect your cash.");
                    } else {
                        System.out.println("Invalid amount or insufficient balance.");
                    }

                    break;

                case 3:

                    System.out.print("Enter amount: ");
                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance = balance + deposit;
                        System.out.println("Amount deposited successfully.");
                    } else {
                        System.out.println("Invalid amount.");
                    }

                    break;

                case 4:

                    System.out.println("Thank you. Please collect your card.");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}