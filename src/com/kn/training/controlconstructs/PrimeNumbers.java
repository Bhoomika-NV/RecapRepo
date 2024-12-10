package com.kn.training.controlconstructs;

import java.util.Scanner;

public class PrimeNumbers {
	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the numbers");
			int n=scan.nextInt();
			for(int i=3;i<n;i++)
			{
			  int number =checkPrime(i);
			  if(number!=0)
			  {
				  System.out.println(number);
			  }
			}
			
}
		public static int checkPrime(int n)
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					return 0;
				}
			}
			return n;
		}
}
