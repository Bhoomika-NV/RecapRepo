//Write a Program that accepts two Strings as
//command line arguments and generate the output
//in the required format. 
//Example1) If the two command line arguments 
//are Wipro and Bangalore then the output generated
//should be Wipro Technologies Bangalore. 

package com.kodnest.training.wiproPrograms;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print(args[0]);
		System.out.print(" Technologies ");
		System.out.print(args[1]);
	}
}
		
	
	
		
	