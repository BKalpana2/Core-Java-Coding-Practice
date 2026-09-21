package com.programs81to100;

import java.util.Scanner;
import java.util.Stack;

public class BalancedParentheses98 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter expression: ");
        String expression = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        boolean balanced = true;

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);

            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    balanced = false;
                    break;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {

                    balanced = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) {
            balanced = false;
        }

        if (balanced) {
            System.out.println("Balanced Parentheses");
        } else {
            System.out.println("Not Balanced");
        }

        sc.close();
    }
}