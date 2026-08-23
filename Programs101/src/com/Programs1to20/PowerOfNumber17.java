package com.Programs1to20;

import java.util.Scanner;

public class PowerOfNumber17 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Base : ");
		int base=s.nextInt();
		System.out.println("Enter the Power : ");
		int power=s.nextInt();
		int result=1;
		for(int i=1;i<=power;i++) {
			result=result*base;
		}
		System.out.println("Power of Base : "+result);
		
		s.close();

	}

}
