package com.kn.training.controlconstructs;

import java.util.Scanner;

public class Table {

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the numbers");
			int n=scan.nextInt();
			printTable(n);

}
public static void printTable(int n)
{
        // int result=1;
	for(int i=1;i<=10;i++)
	{
		int result=n*i;
		System.out.println(n+" "+"*"+" "+i+" "+"="+result);
	}
	
}
}