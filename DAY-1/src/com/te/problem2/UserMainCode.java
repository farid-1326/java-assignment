package com.te.problem2;

public class UserMainCode {
	public static Integer sumOfSquaresOfEvenDigits(Integer num)
	{
		if(num>=0) {
			int sum=0;
			while(num>0)
			{
				int last=num%10;
				if(last%2==0)
				{
					sum=sum+last*last;
				}
				num=num/10;
			}
			return sum;
		}
		else {
			return 0;
		}
	}
	

}
