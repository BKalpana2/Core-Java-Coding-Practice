package com.programs81to100;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum92 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {

                System.out.println("Elements are: "
                        + complement + " and " + arr[i]);

                System.out.println("Indexes are: "
                        + map.get(complement) + " and " + i);

                sc.close();
                return;
            }

            map.put(arr[i], i);
        }

        System.out.println("No two elements found.");

        sc.close();
    }
}