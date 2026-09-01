package com.programs61to80;

import java.util.Scanner;

public class MajorityElement65 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int candidate = arr[0];
        int count = 1;

        // Finding candidate
        for (int i = 1; i < n; i++) {

            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }

        // Checking candidate
        count = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] == candidate) {
                count++;
            }
        }

        if (count > n / 2) {
            System.out.println("Majority element: " + candidate);
        } else {
            System.out.println("No majority element");
        }

        sc.close();
    }
}