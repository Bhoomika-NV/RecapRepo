package com.kn.training.controlconstructs;

import java.util.Scanner;

public class Gcd {
	public static void main (String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enterrrr"); 
		
		int n1 =scan.nextInt();
		int n2 =scan.nextInt();
		int gcd=1;
		for(int i=1;i<=n1 && i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("gcd of "+n1+"  &  " +n2+"  is "+gcd);
}

}

