package com.Programs1to20;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Binary number : ");
	int binary=s.nextInt();
	int result=0;
	int power=1;
	while(binary>0) {
		int digit=binary%10;
		result=result+digit*power;
		power*=2;
		binary=binary/10;
	}
	System.out.println(result);
	
	s.close();

	}

}
