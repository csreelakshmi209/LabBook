package com.lab6.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharacters {
	public static Map<Character, Integer> countChars(String str) {
		// creating hashmap
		Map<Character, Integer> m1 = new HashMap<>();
		char[] array = str.toCharArray();
		for (char c : array) {

			if (m1.containsKey(c)) {
				m1.put(c, m1.get(c) + 1);
			} else {
				m1.put(c, 1);
			}
			for (Map.Entry entry : m1.entrySet()) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}

		}
		return m1;

	}

	public static void main(String[] args) {

		System.out.println("enter characters");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		System.out.println("each character occurence is:");
		countChars(str1);
	}

}
