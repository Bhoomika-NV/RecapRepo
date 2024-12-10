//counting the number of armstrong numbers
package com.kn.training.controlconstructs;

import java.util.Scanner;

public class Armstrong3App {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the range of numbers");
	int num1 = scan.nextInt();
	int num2= scan.nextInt();
	int count=0;
	for(int i=num1;i<=num2;i++)
	{
	int power =Armstrong3.getcount(i);
	int res=Armstrong3.findArm(i,power);
		if(i==res)
		{
		System.out.println(i+" is Armstrong number");
		count++;
		}
	}
	System.out.println("There are "+count+" Armstrong numbers in the range"+ num1+" & "+num2);
}

}
