package com.programs21to40;
import java.util.Scanner;
public class CharacterTriangle36 {


	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of rows: ");
	        int n = sc.nextInt();

	        for (int i = 1; i <= n; i++) {

	            // Spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Increasing characters
	            for (int j = 0; j < i; j++) {
	                System.out.print((char) ('A' + j));
	            }

	            // Decreasing characters
	            for (int j = i - 2; j >= 0; j--) {
	                System.out.print((char) ('A' + j));
	            }

	            System.out.println();
	        }

	        sc.close();
	    }
	}
