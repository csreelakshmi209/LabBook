package com.labFive.Exceptions;

import java.util.Scanner;

public class FullName {
	Scanner scn;
	public void fullName() throws InvalidName
	{
		scn=new Scanner(System.in);
		System.out.println("enter your first name");
		String firstName=scn.nextLine();
		System.out.println("enter your middle name");
		String middleName=scn.nextLine();
		System.out.println("enter your last name");
		String lastName=scn.nextLine();
		
		
		if(firstName.length()==0)
		{
			throw new InvalidName("first name cant be null");
			
		}
		if(lastName.length()==0)
		{
			throw new InvalidName("last name cant be null");
		}
		System.out.println("data saved");
		
		
	}
}
