package com.labBook.one;

public class IncreaseNum {

	public static void main(String[] args) {
		increasingNum(134468);
	}
	static void increasingNum(int n)
	{
		boolean increasing=true;
		while(n>0)
		{
			int d1=n%10;
			n=n/10;
			int d2=n%10;
			
			if(d2>d1)
			{	
				increasing=false;
				break;
			}
		}
		if(increasing)
			System.out.println(" is in increaing order");
		else System.out.println("not in an increaing order");
	}
}
