package com.Programs1to20;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int n=s.nextInt();
	int temp=n;
	int sum=0;
	while(n>0) {
		int d=n%10;
		int fact=1;
	for(int i=d;i>0;i--) {
		fact=i*fact;
	}
	sum+=fact;
	n=n/10;
	}
	if(temp==sum)
		System.out.println("Strong number");
	else
		System.out.println("Not a Strong number");
	s.close();

	}

}
