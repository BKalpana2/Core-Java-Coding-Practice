package com.Programs1to20;
import java.util.Scanner;
public class CountofDigits8 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number : ");
	int n=s.nextInt();
	int cnt=0;
	if(n==0) {
		cnt=1;
	}else {
	while(n>0) {
		cnt++;
		n=n/10;
	}
	}
	System.out.println(cnt);
	s.close();

	}

}
