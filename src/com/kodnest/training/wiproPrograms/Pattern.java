package com.kodnest.training.wiproPrograms;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=3;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}
}
