package com.kn.training.Whileloops;

import java.util.Scanner;

public class SmallestNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number ");
		int n =scan.nextInt();
		findSmallestNum(n);
		
	}
public static void findSmallestNum(int n)
{ 
	int smallest_num=9;
	while(n>0)
	{
		int rem=n%10;
		if(rem<smallest_num)
		{
			smallest_num=rem;
			
	
		}
		n=n/10;
		
	}
	System.out.print(smallest_num);
}
}
