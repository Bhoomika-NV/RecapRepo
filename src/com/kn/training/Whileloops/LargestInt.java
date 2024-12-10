package com.kn.training.Whileloops;

import java.util.Scanner;

public class LargestInt {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=scan.nextInt();
		int largest_num=0;
		 while(n>0)
		 {
			int rem=n%10;
			if(rem>largest_num)
			{
			largest_num=rem;
			
			}
			n=n/10;
			
		 }
		 System.out.println(largest_num);
}
}
