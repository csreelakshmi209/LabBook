package com.lab3.stringsParsing;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// enter an integer and print those integers

		Scanner scn = new Scanner(System.in);
		System.out.println("enter the final limit of integer: ");
		int num = scn.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {
			System.out.println("new integer is: " + i);
			// do their sum and print the sum
			sum += i;

		}
		System.out.println("sum of the integers: " + sum);

	}
}
