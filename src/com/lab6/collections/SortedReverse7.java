package com.lab6.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortedReverse7 {
	public static void getSorted(List<Integer> array) {
		
		// getting arraylist elements
		System.out.println("list of elements is: " + array);
		System.out.println();
		
		// reversing an array list
		Collections.reverse(array);
		System.out.println("Elements after reversing" + array);
		
		// sorting using treeset
		Set<Integer> s2 = new TreeSet<>(array);
		System.out.println();
		System.out.println("elements after sorting");
		for (int i : s2) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		// creating an arraylist
		List<Integer> s2 = new ArrayList<>();
		s2.add(10);
		s2.add(50);
		s2.add(30);
		s2.add(60);
		s2.add(20);
		// calling getSorted method
		getSorted(s2);

	}
}
