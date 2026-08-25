package com.programs21to40;

import java.util.Scanner;

public class InvertedTrinagle27{

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n : ");
		int n=s.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		s.close();

	}

}
