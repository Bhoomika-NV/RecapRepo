package com.kn.training.controlconstructs;

public class Armstrong2sub {
	
	static int getCount(int num)
	{
	
	int count=0;
	while(num!=0)
	{
		int digit=num%10;
		count++;
		num=num/10;
		
	}
	return count;
}
	
static int findArm(int num,int Power)
{int sum=0;

	if(num==0)
	{
		return 0;
	}


	while(num!=0)
	{
		int digit= num%10;
		int pow=1;
		for(int i=1;i<=Power;i++)
		{
			pow=digit*pow;
		}
//int pow=(int)Math.pow(digit, Power);
		sum=sum+pow;
		num=num/10;
	}
	return sum;
	}


	}
