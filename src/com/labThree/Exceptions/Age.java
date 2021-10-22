package com.labThree.Exceptions;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter your age");
		int a=scn.nextInt();
		age(a);
	}
	static void age(int age)
	{
		if(age<=15)
		{
			throw new ArithmeticException("your age is less than 15 so not valid");
		}
		else
		{
			System.out.println("your age is above 15 so your are valid");
		}
	}
	
	
}
