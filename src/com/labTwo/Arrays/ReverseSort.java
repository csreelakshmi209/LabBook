package com.labTwo.Arrays;

import java.util.Arrays;

public class ReverseSort {
	public static void main(String[] args) {
		int[]arr= {7,4,6,3,9,2,1};
		for(int i=arr.length-1;i>=0;i--)
		{
			for(int j=arr.length-1;j>=0;j--)
			{
				if(arr[j]>arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
}
