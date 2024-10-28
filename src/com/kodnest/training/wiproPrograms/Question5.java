//Given two non-negative int values ,print true if they
//have the same last digit such as width 27 and 57

package com.kodnest.training.wiproPrograms;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int a=scan.nextInt();int b=scan.nextInt();
		//int a =27,b=37;
		findLastDigit(a,b);
		
	}
	static void findLastDigit(int n,int m)
	{
		
			int n1=n%10;
			int m1=m%10;
		
		if(n1==m1)
			System.out.println(true+" The numbers have same last digits");
		else
			System.out.println(false+" The numbers does not have same last digits");
	}

}
