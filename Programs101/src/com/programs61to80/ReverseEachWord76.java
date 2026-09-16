package com.programs61to80;

import java.util.Scanner;

public class ReverseEachWord76 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        System.out.println("After reversing each word:");

        for (String word : words) {
            String rev = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                rev = rev + word.charAt(i);
            }

            System.out.print(rev + " ");
        }

        sc.close();
    }
}
