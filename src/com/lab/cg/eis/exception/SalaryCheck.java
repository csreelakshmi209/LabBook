package com.lab.cg.eis.exception;

import java.util.Scanner;

public class SalaryCheck {
	Scanner scn=new Scanner(System.in);
	
	public void salary() throws EmployeeException   {
		System.out.println("enter your salary");
		float salary=scn.nextFloat();
		
		if(salary<=3000)
		{
			throw new EmployeeException("sorry!!!! your salary is below 3000");
		}
	}
}
