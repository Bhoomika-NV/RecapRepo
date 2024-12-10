package com.kn.training.controlconstructs;

import java.util.Scanner;

public class SqaureOfNum {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the number");
	int n =scan.nextInt();
	findSquare(n);
}
public static void findSquare(int n)
{
//	int res=0;
//	for(int i=1;i<=n;i++)
//	{
//		int r=n%10;
//		  res=res+(r*r);
//		  n=n/10;
//	}
	int res=n*n;
	System.out.println(res);

}
}
