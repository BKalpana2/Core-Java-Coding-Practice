package com.Programs1to20;
import java.util.Scanner;
public class SwapNumbers13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the a : ");
		int a=s.nextInt();
		System.out.println("Enter the b : ");
		int b=s.nextInt();
		System.out.println("Before swaping : "+a +" "+b);
		//Using third varaible
//		int temp=a;
//		a=b;
//		b=temp;
		//without using third variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping : "+a +" "+b);
		s.close();

	}

}
