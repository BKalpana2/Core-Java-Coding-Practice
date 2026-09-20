package com.programs81to100;

import java.util.ArrayList;
import java.util.Scanner;

class Book {

    int id;
    String title;
    boolean issued;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.issued = false;
    }

    public void display() {
        System.out.println(
                "ID: " + id +
                " | Title: " + title +
                " | Status: " + (issued ? "Issued" : "Available")
        );
    }
}

public class LibraryManagementSystem95 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter book ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();

                    books.add(new Book(id, title));

                    System.out.println("Book added successfully.");
                    break;

                case 2:

                    for (Book book : books) {
                        book.display();
                    }
                    break;

                case 3:

                    System.out.print("Enter book ID: ");
                    int issueId = sc.nextInt();

                    for (Book book : books) {

                        if (book.id == issueId) {

                            if (!book.issued) {
                                book.issued = true;
                                System.out.println("Book issued.");
                            } else {
                                System.out.println("Book is already issued.");
                            }

                            break;
                        }
                    }
                    break;

                case 4:

                    System.out.print("Enter book ID: ");
                    int returnId = sc.nextInt();

                    for (Book book : books) {

                        if (book.id == returnId) {

                            book.issued = false;

                            System.out.println("Book returned.");
                            break;
                        }
                    }
                    break;

                case 5:

                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}