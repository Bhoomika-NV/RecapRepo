package com.kn.training.Whileloops;

import java.util.Scanner;

public class BinarytoDecimal {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the binary number");
	String binary=scan.nextLine();
	
	System.out.println(binaryToDecimal(binary));
	
	
}
public static double binaryToDecimal(String binary) {
	double decimal=0;
	int power=0;
	//for(int i=binary.length()-1;i>=0;i--)
	int i=binary.length()-1;
	while(i>=0)
	{
		int digit=Character.getNumericValue(binary.charAt(i));
		decimal =decimal+digit*Math.pow(2, power);
		power++;
		i--;
				
	}
	return decimal;
}
}
