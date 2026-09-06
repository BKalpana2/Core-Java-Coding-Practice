package com.programs61to80;

import java.util.Scanner;

public class RemoveSpaces72 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = str.replaceAll("\\s", "");

        System.out.println("After removing spaces: " + result);

        sc.close();
    }
}