package com.Programs1to20;
import java.util.Scanner;
public class Fibnocci6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=s.nextInt();
		int n1=0,n2=1;
		int sum=0;
		for(int i=1;i<=n;i++) {
			System.out.println(n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
		s.close();

	}

}
