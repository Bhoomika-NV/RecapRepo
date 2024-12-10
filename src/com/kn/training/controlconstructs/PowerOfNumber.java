package com.kn.training.controlconstructs;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the base ");
		int base=scan.nextInt();
		System.out.println("Enter the exponent ");
		int e=scan.nextInt();
		
		printPower(e,base);
	}
	
	public static void  printPower(int e,int base)
	{
		int power=1;
		for(int i=1;i<=e;i++)
		{
			power=base*power;
		}
		
		System.out.println(power);
		

}
}

