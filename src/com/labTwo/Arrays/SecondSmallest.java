package com.labTwo.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		int[]arr= {5,3,7,8,2,8,6,2};
		int min1=arr[0],min2=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min1)
			{
				min1=arr[i];
			}
			else if(arr[i]<min2 ) 
			{
				min2=arr[i];
			}
		}
		System.out.println("2nd smallest: "+min2);
		}
}
