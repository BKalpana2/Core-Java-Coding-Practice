package com.programs81to100;

import java.util.ArrayList;
import java.util.Scanner;

class Student {

    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("------------------");
    }
}

public class StudentManagementSystem94 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter student ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter student age: ");
                    int age = sc.nextInt();

                    students.add(new Student(id, name, age));

                    System.out.println("Student added successfully.");
                    break;

                case 2:

                    if (students.isEmpty()) {
                        System.out.println("No students available.");
                    } else {

                        for (Student student : students) {
                            student.display();
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter student ID to search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Student student : students) {

                        if (student.id == searchId) {
                            student.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter student ID to delete: ");
                    int deleteId = sc.nextInt();

                    boolean deleted = false;

                    for (int i = 0; i < students.size(); i++) {

                        if (students.get(i).id == deleteId) {

                            students.remove(i);
                            deleted = true;

                            System.out.println("Student deleted.");
                            break;
                        }
                    }

                    if (!deleted) {
                        System.out.println("Student not found.");
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