package com.programs61to80;

import java.util.Scanner;

public class KadaneAlgorithm64 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int currentSum = arr[0];
        int maximumSum = arr[0];

        for (int i = 1; i < n; i++) {

            currentSum = Math.max(arr[i], currentSum + arr[i]);

            maximumSum = Math.max(maximumSum, currentSum);
        }

        System.out.println("Maximum subarray sum: " + maximumSum);

        sc.close();
    }
}