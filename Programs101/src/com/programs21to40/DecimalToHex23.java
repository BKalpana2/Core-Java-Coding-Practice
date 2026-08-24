package com.programs21to40;

import java.util.Scanner;

public class DecimalToHex23 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the decimal number : ");
		int decimal=s.nextInt();
		String r="";
		while(decimal>0) {
			int digit=decimal%16;
			if(decimal<10) {
				r=digit+r;
			}else {
				r=(char)('A'+digit-10)+r;
			}
		decimal=decimal/16;
		}
		System.out.println("Decimal to Hexadecimal : "+r);
		s.close();

	}

}
