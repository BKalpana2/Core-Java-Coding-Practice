package com.programs41to60;

import java.util.Scanner;

public class RemoveDuplicates54 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = new int[n];

        int newSize = 0;

        for (int i = 0; i < n; i++) {

            boolean duplicate = false;

            for (int j = 0; j < newSize; j++) {

                if (arr[i] == result[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                result[newSize] = arr[i];
                newSize++;
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < newSize; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}