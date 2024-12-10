package com.kn.training.DoWhileloops;
import java.util.Scanner;
public class NumberOfDigits {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int n = scan.nextInt();
		int count=0;
		int sum=0;
		//int i=0;
		do
		{     int rem=n%10;
			sum=sum+rem;
			n=n/10;
			//i++;
			count++;
		}while(n>0);		
		System.out.print(count);		
	}
}
