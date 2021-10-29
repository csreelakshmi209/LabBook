package com.lab6.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondSmallest5 {
	public int getSecondSmallest(int[] arr) {
		// creating arraylist and changing array to arraylist
		List<Integer> l1 = new ArrayList<>(arr.length);
		for (int n : arr) {
			l1.add(n);
		}
		// sorting
		Collections.sort(l1);
		System.out.println(l1);

		int min1 = l1.get(0), min2 = l1.get(0);
		for (int i = 1; i < l1.size(); i++) {
			if (l1.get(i) < min1) {
				min2 = min1;
				min1 = l1.get(i);
			} else if (l1.get(i) < min2) {
				min2 = l1.get(i);
			}
		}
		System.out.println(min2);

		return 0;
	}

	public static void main(String[] args) {
		SecondSmallest5 small = new SecondSmallest5();
		int[] arr = { 5, 4, 2, 8, 7, 5, 1 };
		small.getSecondSmallest(arr);
	}
}
