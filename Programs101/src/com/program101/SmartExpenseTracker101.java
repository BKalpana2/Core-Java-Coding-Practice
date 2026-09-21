package com.program101;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Expense {

    int id;
    String category;
    String description;
    double amount;

    Expense(int id, String category, String description, double amount) {
        this.id = id;
        this.category = category;
        this.description = description;
        this.amount = amount;
    }

    public void display() {
        System.out.println(
                "ID: " + id +
                " | Category: " + category +
                " | Description: " + description +
                " | Amount: ₹" + amount
        );
    }
}

public class SmartExpenseTracker101 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Expense> expenses = new ArrayList<>();

        int id = 1;

        while (true) {

            System.out.println("\n===== SMART EXPENSE TRACKER =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. Total Spending");
            System.out.println("4. Highest Expense");
            System.out.println("5. Category-wise Spending");
            System.out.println("6. Search by Category");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter category: ");
                    String category = sc.nextLine();

                    System.out.print("Enter description: ");
                    String description = sc.nextLine();

                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();

                    expenses.add(
                            new Expense(id, category, description, amount)
                    );

                    System.out.println("Expense added successfully.");
                    System.out.println("Expense ID: " + id);

                    id++;

                    break;

                case 2:

                    if (expenses.isEmpty()) {
                        System.out.println("No expenses available.");
                    } else {

                        System.out.println("\n----- All Expenses -----");

                        for (Expense expense : expenses) {
                            expense.display();
                        }
                    }

                    break;

                case 3:

                    double total = 0;

                    for (Expense expense : expenses) {
                        total = total + expense.amount;
                    }

                    System.out.println("Total Spending: ₹" + total);

                    break;

                case 4:

                    if (expenses.isEmpty()) {
                        System.out.println("No expenses available.");
                    } else {

                        Expense highest = expenses.get(0);

                        for (Expense expense : expenses) {

                            if (expense.amount > highest.amount) {
                                highest = expense;
                            }
                        }

                        System.out.println("Highest Expense:");

                        highest.display();
                    }

                    break;

                case 5:

                    HashMap<String, Double> categoryTotal = new HashMap<>();

                    for (Expense expense : expenses) {

                        categoryTotal.put(
                                expense.category,
                                categoryTotal.getOrDefault(
                                        expense.category, 0.0
                                ) + expense.amount
                        );
                    }

                    System.out.println("\n----- Category-wise Spending -----");

                    for (String key : categoryTotal.keySet()) {

                        System.out.println(
                                key + " : ₹" + categoryTotal.get(key)
                        );
                    }

                    break;

                case 6:

                    System.out.print("Enter category to search: ");
                    String searchCategory = sc.nextLine();

                    boolean found = false;

                    for (Expense expense : expenses) {

                        if (expense.category.equalsIgnoreCase(searchCategory)) {

                            expense.display();

                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("No expenses found in this category.");
                    }

                    break;

                case 7:

                    System.out.println("Thank you for using Smart Expense Tracker!");

                    sc.close();

                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}
