package com.Programs1to20;

import java.util.Scanner;

public class Largestof3Numbers14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the a : ");
		int a=s.nextInt();
		System.out.println("Enter the b : ");
		int b=s.nextInt();
		System.out.println("Enter the c : ");
		int c=s.nextInt();
		if(a>=b&&a>=c) {
			System.out.println("a is Largest : "+a);
		}
		else if(b>=a&&b>=c) {
			System.out.println("b is largest : "+b);
		}
		else {
			System.out.println("c is largest : "+c);
		}
		s.close();

	}

}
