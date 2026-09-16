package com.programs81to100;

import java.util.Scanner;

public class RecursiveBinarySearch83 {

    public static int binarySearch(int[] arr, int left, int right, int target) {

        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, right, target);
        }

        return binarySearch(arr, left, mid - 1, target);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int result = binarySearch(arr, 0, arr.length - 1, target);

        if (result != -1) {
            System.out.println("Element Found at index: " + result);
        } else {
            System.out.println("Element Not Found");
        }

        sc.close();
    }
}