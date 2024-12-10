package com.kn.training.Whileloops;

import java.util.Scanner;

public class LengthOfNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number ");
		int n=scan.nextInt();
		printNum(n);
	}
public static void printNum(int n) {
	int count=0;
	int res=0;
	//int i=0;
	while(n>0)
	{
		int rem=n%10;
		res=rem+res;
		n=n/10;
		
		count++;
	}
	System.out.println(count);
}
}
