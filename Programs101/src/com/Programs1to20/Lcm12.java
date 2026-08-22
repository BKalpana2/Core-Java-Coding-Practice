package com.Programs1to20;

import java.util.Scanner;

public class Lcm12 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the a : ");
		int a=s.nextInt();
		int aa=a;
		System.out.println("Enter the b : ");
		int b=s.nextInt();
		int bb=b;
		while(b!=0) {
			int r=a%b;
			a=b;
			b=r;
		}
		int lcm=(aa*bb)/a;
		System.out.println("LCM : "+lcm);
		s.close();
	}

}
