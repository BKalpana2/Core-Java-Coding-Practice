package com.programs61to80;

import java.util.Scanner;

public class CountWords71 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.trim().split("\\s+");

        System.out.println("Number of words: " + words.length);

        sc.close();
    }
}