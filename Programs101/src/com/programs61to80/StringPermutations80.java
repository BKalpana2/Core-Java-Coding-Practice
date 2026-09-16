package com.programs61to80;
import java.util.Scanner;

public class StringPermutations80 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        System.out.println("Permutations:");

        generatePermutations(str, "");

        sc.close();
    }

    public static void generatePermutations(String str, String result) {

        if (str.length() == 0) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String remaining = str.substring(0, i)
                    + str.substring(i + 1);

            generatePermutations(remaining, result + ch);
        }
    }
}
