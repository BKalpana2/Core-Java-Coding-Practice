package com.programs21to40;
import java.util.Scanner;
public class DecimalToBinary21{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the decimal number : ");
		int decimal=s.nextInt();
		String r="";
		while(decimal>0) {
			int digit=decimal%2;
			r=digit+r;
			decimal=decimal/2;
		}
		System.out.println("Binary : "+r);
		
		s.close();

	}

}
