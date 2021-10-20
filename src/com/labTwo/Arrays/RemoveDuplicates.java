package com.labTwo.Arrays;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String var=null;
		String s1=" ";
		int []arr= {5,5,6,6,7,7};
		int []temp=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length-1;i++)
		{
				
				if(arr[i]!=arr[i+1])
				{
					 temp[j]=arr[i];
					 j++;
				}
			}
			
		}

	}

