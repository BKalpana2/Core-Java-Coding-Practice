package com.programs81to100;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapFrequency91 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Character Frequency:");

        for (Character key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }

        sc.close();
    }
}
