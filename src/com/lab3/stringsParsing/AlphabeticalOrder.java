package com.lab3.stringsParsing;

import java.util.Arrays;

//checks whether the string is in alphabetical order or not
public class AlphabeticalOrder {

	static boolean isAlphabeticalOrder(String s1) {
		int str = s1.length();

		// create char array to the string length
		char c[] = new char[str];

		for (int i = 0; i < str; i++) {
			// assign string to char array
			c[i] = s1.charAt(i);
		}
		Arrays.sort(c);
		for (int i = 0; i < str; i++) {
			if (c[i] != s1.charAt(i))
				return false;
		}
		return true;

	}

	public static void main(String[] args) {
		String s1 = "abcda";
		
		if (isAlphabeticalOrder(s1))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
