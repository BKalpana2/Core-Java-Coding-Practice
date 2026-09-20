package com.programs81to100;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GroupAnagrams93 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        HashMap<String, List<String>> map = new HashMap<>();

        System.out.println("Enter the words:");

        for (int i = 0; i < n; i++) {

            String word = sc.next();

            char[] chars = word.toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());

            map.get(key).add(word);
        }

        System.out.println("Grouped Anagrams:");

        for (List<String> group : map.values()) {
            System.out.println(group);
        }

        sc.close();
    }
}