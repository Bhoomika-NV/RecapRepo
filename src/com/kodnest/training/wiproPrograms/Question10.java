package com.kodnest.training.wiproPrograms;

import java.util.Scanner;

public class Question10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	System.out.println("Hey User please enter the color codes R ,B,G,O,Y,W");
		char ch=scan.next().charAt(0);
		switch(ch){
		case'R':
			System.out.println("RED");
			break;
		case'B':
			System.out.println("Blue");
			break;
		case'G':
			System.out.println("Green");
			break;
		case'O':
			System.out.println("Orange");
			break;
		case'Y':
			System.out.println("Yellow");
			break;
		case'W':
			System.out.println("White");
			break;
			default:
				System.out.println("INVALID COLOR CODE");
		}
	}
}
