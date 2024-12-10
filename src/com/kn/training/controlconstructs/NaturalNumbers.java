package com.kn.training.controlconstructs;

import java.util.Scanner;

public class NaturalNumbers {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the numbers");
	int n=scan.nextInt();
	 naturalNumbers(n);
}
	public static void naturalNumbers(int n)
	{
		int res=1;
		for(int i=1;i<=n;i++)
		{
			res=res+i;
			System.out.println(i);
		}
		System.out.println();
		System.out.println(res);
	}
}

