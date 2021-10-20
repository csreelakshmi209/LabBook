package com.labBook.one;

public class Fibonocci {

	public static void main(String[] args) {
		fibonocci(10);	
	}
	
	static void fibonocci(int n)
	{
		int i,a=1,b=1,c,m=0;
		for(i=0;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			m=m+c;
		}
		System.out.println("their sum is:"+m);
		System.out.println("the series is"+n);
	}
}
