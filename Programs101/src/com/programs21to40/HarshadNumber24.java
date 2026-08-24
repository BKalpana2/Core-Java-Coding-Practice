package com.programs21to40;

import java.util.Scanner;

public class HarshadNumber24 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int n=s.nextInt();
	int temp=n;
	int sum=0;
	while(n>0) {
		int digit=n%10;
		sum+=digit;
		n=n/10;
	}
	if(temp%sum==0) {
		System.out.println("Harshad number");
	}
	else {
		System.out.println("Not a Harshad Number");
	}
	s.close();

	}

}
