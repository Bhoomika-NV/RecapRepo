package com.kn.training.Whileloops;

import java.util.Scanner;

public class ProductOfDigits {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number ");
	int n =scan.nextInt();
	int prod=1;
	int i=0;
	while(i<=n)
	{
		int rem=n%10;
		prod=rem*prod;
		n =n/10;
		i++;
		
	}
	System.out.println(prod);
}
}
