package com.programs21to40;

import java.util.Scanner;

public class HappyNumber25 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		while(n!=1&&n!=4) {
			int sum=0;
			while(n>0) {
				int digit=n%10;
				sum+=(digit*digit);
				n=n/10;
			}
			n=sum;
		}
		if(n==1) {
			System.out.println("Happy number");
		}else {
			System.out.println("Not a Happy number ");
		}
		s.close();

	}

}
