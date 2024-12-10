package com.kn.training.controlconstructs;
//Sum of a digits in number
import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=scan.nextInt();
		 findSum(n);
}
	public static void findSum(int n)
	{
		int sum=0;
		for(int i=1;n>0;i++)
		{
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);
		
	}
}



	
	
