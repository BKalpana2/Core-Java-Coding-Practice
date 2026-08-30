package com.programs41to60;

import java.util.Scanner;

public class MissingNumber55 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " numbers:");

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int i = 0; i < arr.length; i++) {
            actualSum = actualSum + arr[i];
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing number: " + missing);

        sc.close();
    }
}