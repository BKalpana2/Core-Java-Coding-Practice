package com.programs21to40;
import java.util.Scanner;
public class DecimalToOctal22{

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the decimal number : ");
	int decimal=s.nextInt();
	String r="";
	while(decimal>0) {
		int digit=decimal%8;
		r=digit+r;
		decimal=decimal/8;
	}
	System.out.println("Decimal to Octal : "+r);
	s.close();

	}

}
