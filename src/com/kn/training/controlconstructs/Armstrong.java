package com.kn.training.controlconstructs;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the number 1:");
	int n=scan.nextInt();
	//int original=n ;
	if(isPrintArmstrong(n)==true)
	{
	System.out.println("Armstrong number");
	}
	else
		System.out.println("not a armstrong number");
	}
	
public static boolean isPrintArmstrong(int num)
{
	int original=num;

	int temp=0;
		for(int i=1;num>0;i++)
		{   
			
		int rem=num%10;
		temp=temp+(rem*rem*rem);
		num=num/10;
		}
		if(original==temp)//becoz n value will be 0 at the end 
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}

