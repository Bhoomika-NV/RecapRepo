package com.kodnest.training.wiproPrograms;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter more than a digit numbers");
		int a=scan.nextInt();
		int res =findSum(a);
		System.out.println("Sum of digits of "+a+" number is  "+res);
		

}
	public static int findSum(int n)
	{
		int sum=0;
		while(n>0)
		{
		int num=n%10;
		sum=sum+num;
		n=n/10;
		}
		return sum;
	}
}