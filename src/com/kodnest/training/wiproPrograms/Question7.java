//Write a program to check if the program has received command 
//line arguments or not.If the program has not received arguments
//then print "No Values", else print all the values in a single line
//separated by ,(comma)
package com.kodnest.training.wiproPrograms;

import java.util.Scanner;

public class Question7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hey user! give any char input");
		char ch=scan.next().charAt(0);
		if(ch>='a'&&ch<='z' || ch>='A'&&ch<='Z')
			System.out.println("Alphabet ");
		else if(ch>='0' && ch<='9')
			System.out.println("Digit");
		else
			System.out.println("Special char");
	}
	
}
