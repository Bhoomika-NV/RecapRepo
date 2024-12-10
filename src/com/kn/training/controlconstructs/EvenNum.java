package com.kn.training.controlconstructs;

import java.util.Scanner;

public class EvenNum {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the number until where the even number should be printed");
	int n =scan.nextInt();
	findEven(n);
}
public static void findEven(int n)
{
	for(int i=0;i<=n;i++)
	{
		if(i%2==0)
		{
		  System.out.println(i);
		}
		// if(i%2!=0)
		//{
			//System.out.println(i);
		//}
	}
	
}
}
