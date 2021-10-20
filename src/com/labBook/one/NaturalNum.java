package com.labBook.one;

public class NaturalNum {
	
	public static void main(String[] args) {
		calculateSum(5);
	}
	static int calculateSum(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0||i%5==0)
			{
				System.out.println(i);
				sum+=i;
			}
		}
	
		System.out.println("the sum of n nums divisible by 3 or 5:"+sum);
		return sum;
	}
}
