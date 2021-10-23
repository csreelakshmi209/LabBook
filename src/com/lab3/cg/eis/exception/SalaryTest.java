package com.lab3.cg.eis.exception;

public class SalaryTest {
	public static void main(String[] args)  {
		SalaryCheck check = new SalaryCheck();
		try {
			check.salary();
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
	}
}
