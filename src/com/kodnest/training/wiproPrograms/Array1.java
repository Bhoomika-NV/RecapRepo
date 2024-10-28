package com.kodnest.training.wiproPrograms;

import java.util.Scanner;

public class Array1 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the array length to be created");
	int arr[]=new int[scan.nextInt()];
	
	System.out.println("enter the array elements");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print("arr["+i+"] = ");
		arr[i]=scan.nextInt();
		
	}
	int sum=0;
	for(int i=0;i<=arr.length-1;i++)
	{
		sum=sum+arr[i];
	}
	int average=sum/arr.length;
	System.out.println("The average of the array elements is "+average);
}
}
