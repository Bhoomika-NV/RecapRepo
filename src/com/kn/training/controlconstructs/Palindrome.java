package com.kn.training.controlconstructs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n=scan.nextInt();
		if(isPalindrome(n)==true)
		{
			System.out.println("The "+n+" is palindrome");
		}
		else
		{
			System.out.println(n+" "+" is not a palindrome");
		}

}
	public static boolean isPalindrome(int n)
	{
		String str=Integer.toString(n);
		int length =str.length();
		for(int i=0;i<length;i++)
		{
			if(str.charAt(i)==str.charAt(length-1-i))
			{
				return true;
			}
		}
		return false;
	}
}
