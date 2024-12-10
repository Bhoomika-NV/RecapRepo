package com.kn.training.controlconstructs;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enterrrr"); 
		
		int n =scan.nextInt();
		
		int f=0 ,s=1,t;
		//int sum=0;
		System.out.print(f+" "+s+" ");
		for(int i=1;i<=n;i++)
		{
			t=f+s;
			System.out.print(t+",");
			f=s;
			s=t;
			//sum=sum+t;
			
		}
		//System.out.println();
		//System.out.println("sum is : "+sum);
		
		
	}

}
