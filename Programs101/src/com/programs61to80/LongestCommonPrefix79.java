package com.programs61to80;
import java.util.Scanner;

public class LongestCommonPrefix79 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        String[] arr = new String[n];

        System.out.println("Enter the strings:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        String prefix = arr[0];

        for (int i = 1; i < n; i++) {

            while (!arr[i].startsWith(prefix)) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.length() == 0) {
                    break;
                }
            }
        }

        System.out.println("Longest Common Prefix: " + prefix);

        sc.close();
    }
}
