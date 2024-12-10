package com.kn.training.controlconstructs;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n=scan.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++)
		{
		sum=i+sum;
		//System.out.print(i+"+");
		}
	System.out.println("="+sum);

}
}
