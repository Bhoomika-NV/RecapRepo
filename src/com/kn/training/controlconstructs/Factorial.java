package com.kn.training.controlconstructs;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter the number to which factorial should be displayed");
	int n =scan.nextInt();
	findFactorial(n);
}
	
	public static void findFactorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		
	    }
		System.out.println(fact);
	
}
}
