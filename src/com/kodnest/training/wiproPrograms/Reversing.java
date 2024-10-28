package com.kodnest.training.wiproPrograms;
import java.util.Scanner;
public class Reversing {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	System.out.println("Hey User please enter any number");
		int number=scan.nextInt();
		System.out.println("The reversed number is "+findReverse(number));
	}
	static int findReverse(int a)
	{
	int rev=0;
	while(a!=0){
			int rem=a%10;
			rev=rev*10+rem;
			a=a/10;
			}
		return rev;
	}
}
