package com.kodnest.training.wiproPrograms;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Hey user please enter any integer ");
	int a= scan.nextInt();
	if(a>0)
		System.out.println("The given integer is Positive ");
	else if(a==0)
		System.out.println("The given integer is equal to zero");
	else
		System.out.println("The given integer is negative number" );
	}

}
