package com.lab6.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HashTreeDemo {
	public static void main(String[] args) {
		HashTreeDemo demo = new HashTreeDemo();
		// implementing hashmap
		Map<Integer, String> m1 = new HashMap<Integer, String>();

		// adding keys,values to hashmap
		m1.put(20, "B");
		m1.put(10, "A");
		m1.put(12, "Z");
		m1.put(22, "X");
		// calling getValues method
		demo.getValues(m1);
	}

	public List getValues(Map<Integer, String> m1) {
		// adding hashmap to treemap
		Map<Integer, String> m2 = new TreeMap<Integer, String>(m1);
		Iterator<Integer> i2 = m2.keySet().iterator();
		while (i2.hasNext()) {
			int i = (int) i2.next();
			System.out.println(" idNum: " + i + "   name: " + m1.get(i));
		}
		return null;

	}

}
