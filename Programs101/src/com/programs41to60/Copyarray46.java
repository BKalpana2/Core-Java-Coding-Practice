package com.programs41to60;

import java.util.Arrays;
import java.util.Scanner;

public class Copyarray46 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] original = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }

        int[] copied = Arrays.copyOf(original, original.length);

        System.out.println("Original Array: " + Arrays.toString(original));
        System.out.println("Copied Array  : " + Arrays.toString(copied));

        sc.close();
    }
}
