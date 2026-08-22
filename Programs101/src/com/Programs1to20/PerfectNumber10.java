package com.Programs1to20;

import java.util.Scanner;

public class PerfectNumber10 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0)
				sum+=i;	
		}
		if(sum==n)
			System.out.println("Perfect");
		else
			System.out.println("Not a perfect");
		s.close();
		

	}

}
