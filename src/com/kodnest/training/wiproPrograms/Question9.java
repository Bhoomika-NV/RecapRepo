package com.kodnest.training.wiproPrograms;

import java.util.Scanner;
class Question9{
	public static void main(String[] args) {
		char ch='s';
		if(ch>='A'&&ch<='Z')
		{
			System.out.println(ch+" ====> "+Character.toLowerCase(ch));
		}
		else
		{
			System.out.println(ch+" ====> "+Character.toUpperCase(ch));
		}
	}
}
