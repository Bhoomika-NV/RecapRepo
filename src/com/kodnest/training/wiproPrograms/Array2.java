package com.kodnest.training.wiproPrograms;

import java.util.Scanner;

public class Array2 {
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
		System.out.println("Enter the key to be searched in array");
		int key=scan.nextInt();
		for(int i=0;i<=arr.length-1;i++)
		{
			if(key==arr[i])
			{
				System.out.println("Key found at the index"+" "+ i);
				return;
			}
		}
			System.out.println("-1");
}
}
