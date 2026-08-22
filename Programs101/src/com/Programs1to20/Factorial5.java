package com.Programs1to20;
import java.util.Scanner;
public class Factorial5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		int fact=1;
		for(int i=n;i>0;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
		s.close();
	}

}
