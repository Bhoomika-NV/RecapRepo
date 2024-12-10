package com.kn.training.controlconstructs;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original=number;
       
      if(original==reverseNumber(number))
      {
    	  System.out.println("palindrome");
      }
      else
      {
    	  System.out.println("not not a PAlindorm");
      }
        
    }    
public static int  reverseNumber(int n)
{
 int reverse = 0;
        //while(n!=0)
        for(int i=1;n>0;i++)
        {
        	int remainder=n%10;
        	reverse=reverse*10+remainder;
        	n=n/10;
        	
        }
        //System.out.println(reverse);
        return reverse;
    }
}
   
 