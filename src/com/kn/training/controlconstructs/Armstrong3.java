package com.kn.training.controlconstructs;
public class Armstrong3 {
	static int getcount(int num1) 
	{      int count=0;
		while(num1!=0)
		{
			int digit=num1%10;
			count++;
			num1=num1/10;
		}
		return count;
	}
	static int findArm(int num1,int power) {
		if(num1==0)
		{
			return 0;
		}
		int sum=0;
		while(num1!=0) {
		int digit=num1%10;
		int pow=1;
		for(int i=1;i<=power;i++)
		{
                  pow=digit*pow;
		}
		sum=sum+pow;
		num1=num1/10;
		}
	return sum;
}
}
