// Checking the armstrong number without using math class
package com.kn.training.controlconstructs;

import java.util.Scanner;

public class Armstrong2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number");
		int num=scan.nextInt();
		int Power=Armstrong2sub.getCount(num);
		int res=Armstrong2sub.findArm(num,Power);
		if(num==res) {
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("not a Armstrong");
		}
		
	}
		
	
	}

	
	


