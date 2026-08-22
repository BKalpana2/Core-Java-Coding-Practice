package com.Programs1to20;
import java.util.Scanner;
public class ArmStrong3 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int n=s.nextInt();
	int temp=n;
	int cnt=0;
	while(n>0) {
		n=n/10;
		cnt++;
	}
	int sum=0;
	n=temp;
	while(n>0) {
		int digit=n%10;
		sum=sum+(int)Math.pow(digit, cnt);
		n=n/10;
	}
	if(temp==sum)
	System.out.println("Armstrong");
	else
		System.out.println("Not");
	s.close();

	}

}
