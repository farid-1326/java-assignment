package com.te.problem9;

public class UserMainCode {
	public static Integer getSumOfSquaresOfDigits(Integer num)
	{
		Integer sum=0;
		while(num>0)
		{
			Integer last=num%10;
			sum=sum+last*last;
			num=num/10;
		}
		return sum;
	}
}
