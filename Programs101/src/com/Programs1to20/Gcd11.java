package com.Programs1to20;
import java.util.Scanner;
public class Gcd11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number1 : ");
		int a=s.nextInt();
		System.out.println("Enter the number2 : ");
		int b=s.nextInt();
		while(b!=0) {
			int r=a%b;
			a=b;
			b=r;
		}	
		System.out.println("GCD : "+a);
		s.close();
	}
}
