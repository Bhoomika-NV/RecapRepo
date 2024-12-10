package com.kn.training.Whileloops;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=scan.nextInt();
		oddnumSum(n);
		
}
	public static void oddnumSum(int n)
	{  
		int count=0;
		int sum=0;
		int i=1;
		while(i<=n)
		{
			if(i%2!=0)
			System.out.println(i);
				sum=sum+i;
			count++;
			i++;
				
			
	}
		System.out.println(count+"  are the number of odd numbers till "+n);
		System.out.println();
		System.out.println(sum+" is the sum of all odd numbers till  "+n);
		
	}
}
