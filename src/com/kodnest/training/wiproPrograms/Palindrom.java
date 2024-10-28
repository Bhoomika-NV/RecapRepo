package com.kodnest.training.wiproPrograms;
import java.util.Scanner;
	public class Palindrom {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
		System.out.println("Hey User please enter any number");
			int number=scan.nextInt();
			int original_num=number;
			int ispalindrome=findPalindrome(number);
			if(original_num==ispalindrome)
				System.out.println("The given number is palidrome");
			else
				System.out.println("The given number is not palindrome");
	}
		static int findPalindrome(int a)
		{	int rev=0;
			while(a!=0){
				int rem=a%10;
				rev=rev*10+rem;
				a=a/10;
				}
				return rev;
		}
	}

